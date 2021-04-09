package com.yzc.service;

import com.yzc.dao.UserMapper;
import com.yzc.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    //用户注册
    public void register(User user) {
        //调用 dao 层的方法

        userMapper.register(user);
    }
    //用户登录
    public boolean login(String mobile, String password) {
        //调用 dao 层的方法
        User user = userMapper.login(mobile,password);
        if(user==null){ return false;
        }else {
            return true;
        }
    }
    //查询用户信息
    public User findById(int id) {
        //调用 dao 层的方法
        return userMapper.findById(id);
    }
    //遍历所有电话号码
    public List<String> findAllMobile(){
        return userMapper.findAllMobile();
    }
}

