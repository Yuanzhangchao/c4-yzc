package com.yzc.controller;

import com.yzc.entity.User;
import com.yzc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("login")
    public String login(@RequestParam String UserName, @RequestParam String UserPsd){
        User user = userService.login(UserName,UserPsd);
        if(user != null){
            System.out.println(user);
            return "登录成功！";
        }

        else
            return "用户名或者密码错误!";
    }
}
