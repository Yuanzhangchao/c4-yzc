package com.yzc.service;

import com.yzc.dao.UserMapper;
import com.yzc.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    //登录
    public User login(String UserName,String UserPsd){
        User user = userMapper.login(UserName,UserPsd);

        if(user == null){
            return null;
        }
        else
            return user;
    }

}
