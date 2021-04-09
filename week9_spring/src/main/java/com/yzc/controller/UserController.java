package com.yzc.controller;

import com.yzc.entity.User;
import com.yzc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    //用户注册
    @RequestMapping("/register")
    public String register(@RequestParam("username") String username,
                           @RequestParam("password") String password,
                           @RequestParam("email") String email,
                           @RequestParam("name") String name,
                           @RequestParam("mobile") String mobile,
                           @RequestParam("sex") String sex,
                           @RequestParam("birthday") String birthday)
            throws Exception {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setEmail(email);
        user.setName(name);
        user.setMobile(mobile);
        user.setSex(sex);
        user.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse(birthday));
        user.setCreatetime(new Date());
        user.setUpdatetime(new Date());
        List<String> mobiles = userService.findAllMobile();
        if(mobiles.contains(mobile)){
            return "注册失败，您输入的号码已经被注册！";
        }
        else{
            userService.register(user);
            return "注册成功!";
        }

    }
    //用户登录
    @RequestMapping("/login")
    public String login( @RequestParam("mobile") String mobile,
                         @RequestParam("password") String password) {
        //调用业务层方法
        boolean flag = userService.login(mobile,password);
        if(flag){
            return "登录成功";
        }
        return "用户名或密码错误";
    }
    //查询用户信息
    @RequestMapping("/findById") public User findById(@RequestParam("id") int id){
        //调用业务层方法
        return userService.findById(id);
    }
    //遍历所有电话号码
    public List<String> findAllMobile(){
        List<String> mobiles = userService.findAllMobile();
        return mobiles;
    }
}
