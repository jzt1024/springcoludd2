package com.jk.service;

import com.jk.model.TreeBean;
import com.jk.model.UserBean;
import com.jk.model.Video;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

/**
 * @Description: java类作用描述
 * @Author: 贾志涛
 * @CreateDate: 2019/4/12$ 23:00$
 * @UpdateUser: 贾志涛
 * @UpdateDate: 2019/4/12$ 23:00$
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */

public interface UserService {
    @GetMapping("FindTreeList")
    @ResponseBody
    List<TreeBean> ListTree();


    @GetMapping("queryUser")
    @ResponseBody
    HashMap<String, Object> queryUser(@RequestParam("page") Integer page,@RequestParam("rows") Integer rows);

    @PostMapping("saveVideo")
    @ResponseBody
    void saveVideo(UserBean video);

    @PostMapping("updateVideo")
    @ResponseBody
    void updateVideo(UserBean video);

    @DeleteMapping("deleteVideo/{ids}")
    @ResponseBody
    void deleteVideo(@PathVariable("ids") Integer[] ids);

    @GetMapping("queryVideoById/{id}")
    @ResponseBody
    UserBean queryVideoById(@PathVariable("id")Integer id);
}
