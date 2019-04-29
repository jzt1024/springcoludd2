package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: java类作用描述
 * @Author: 贾志涛
 * @CreateDate: 2019/4/14$ 14:40$
 * @UpdateUser: 贾志涛
 * @UpdateDate: 2019/4/14$ 14:40$
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@Controller
public class pageController {

    @RequestMapping("tomain")
    public String tomain(){
        return "main";
    }
    @RequestMapping("toshow")
    public String toshow(){
        return "show";
    }


    /**
     * 跳转到新增页面
     * @return
     */
    @GetMapping("toAdd")
    public String toAdd(){
        return "add";
    }

    /**
     * 跳转到修改页面
     * @return
     */
    @RequestMapping("toEdit")
    public String toEdit(){
        return "edit";
    }


}
