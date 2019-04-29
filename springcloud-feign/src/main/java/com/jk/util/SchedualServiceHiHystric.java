package com.jk.util;

import com.jk.model.TreeBean;
import com.jk.model.UserBean;
import com.jk.service.UserService;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

/**
 * @Description: java类作用描述
 * @Author: 贾志涛
 * @CreateDate: 2019/4/15$ 10:56$
 * @UpdateUser: 贾志涛
 * @UpdateDate: 2019/4/15$ 10:56$
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@Component
public class SchedualServiceHiHystric implements UserService {


    @Override
    public List<TreeBean> ListTree() {

        return null;
    }

    @Override
    public HashMap<String, Object> queryUser(Integer page, Integer rows) {
        return null;
    }

    @Override
    public void saveVideo(UserBean video) {

    }

    @Override
    public void updateVideo(UserBean video) {

    }

    @Override
    public void deleteVideo(Integer[] ids) {

    }

    @Override
    public UserBean queryVideoById(Integer id) {
        return null;
    }
}
