package com.jk.service.Impl;

import com.alibaba.fastjson.JSON;
import com.jk.mapper.UserMapper;
import com.jk.model.TreeBean;
import com.jk.model.UserBean;
import com.jk.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;

/**
 * @Description: java类作用描述
 * @Author: 贾志涛
 * @CreateDate: 2019/4/12$ 22:30$
 * @UpdateUser: 贾志涛
 * @UpdateDate: 2019/4/12$ 22:30$
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@Controller
public class UserserviceImpl implements UserService {


    @Autowired
    private UserMapper userMapper;

    @Override
    @ResponseBody
    public List<TreeBean> ListTree() {
        Integer pid=0;
        List<TreeBean> list = getTreeBeans(pid);
        return list;
    }
    private List<TreeBean> getTreeBeans(Integer pid) {
        List<TreeBean> list=userMapper.ListTree(pid);
        for (TreeBean treeBean : list) {
            Integer id2 = treeBean.getId();
            List<TreeBean> findNodes = getTreeBeans(id2);
            //判断有没有子节点
            if(findNodes.size()<=0) {
                //没有子节点，应该点击
                treeBean.setSelectable(true);
            }else {
                //有子节点，不能点击
                treeBean.setNodes(findNodes);
                treeBean.setSelectable(false);
            }
        }
        return list;
    }


    @Override
    @ResponseBody
    public HashMap<String, Object> queryUser(Integer page, Integer rows) {
        HashMap<String,Object> result = new HashMap<>();
        UserBean video = JSON.parseObject(null,UserBean.class);
        int total = userMapper.queryVideoCount(video);
        int start = (page-1)*rows;
        List<UserBean> list = userMapper.queryVideo(start,rows,video);
        result.put("total",total);
        result.put("rows",list);
        return result;
    }

    @Override
    @ResponseBody
    public void saveVideo(@RequestBody UserBean video) {
        userMapper.saveVideo(video);
    }

    @Override
    @ResponseBody
    public void updateVideo( @RequestBody UserBean video) {
        userMapper.updateVideo(video);
    }

    @Override
    @ResponseBody
    public void deleteVideo(Integer[] ids) {
        userMapper.deleteVideo(ids);
    }

    @Override
    @ResponseBody
    public UserBean queryVideoById(Integer id) {
        return userMapper.queryVideoById(id);
    }

}
