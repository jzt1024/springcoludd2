package com.jk.controller;

import com.jk.model.TreeBean;
import com.jk.model.UserBean;
import com.jk.model.Video;
import com.jk.service.UserListService;
import feign.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

/**
 * @Description: java类作用描述
 * @Author: 贾志涛
 * @CreateDate: 2019/4/12$ 22:08$
 * @UpdateUser: 贾志涛
 * @UpdateDate: 2019/4/12$ 22:08$
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@RestController
public class UserController {

    @Autowired
    private UserListService userListService;

   @GetMapping("FindTreeList")
    public List<TreeBean> ListTree(){
       return userListService.ListTree();
   }

   @GetMapping("queryUser")
       public HashMap<String,Object> queryUser(Integer page,Integer rows){
       HashMap<String, Object> stringObjectHashMap = userListService.queryUser(page, rows);
       return stringObjectHashMap;
       }
    @PostMapping("saveVideo")
    public void saveVideo(UserBean video){
        userListService.saveVideo(video);
    }

    @PostMapping("updateVideo")
    public void updateVideo( UserBean video){

       userListService.updateVideo(video);
    }

    @DeleteMapping("deleteVideo/{ids}")
    public void deleteVideo(@PathVariable("ids") Integer[] ids){
        userListService.deleteVideo(ids);
    }

    @GetMapping("queryVideoById/{id}")
    public UserBean queryVideoById(@PathVariable("id") Integer id){
        UserBean userBean = userListService.queryVideoById(id);
        return userBean;
    }

}
