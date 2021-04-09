package com.yzc.dao;

import com.yzc.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
    void register(User user);
    //用户登录
    User login(@Param("mobile") String mobile, @Param("password") String password);
    //查询用户信息
    User findById(int id);
    //遍历所有电话号码
    List<String> findAllMobile();
}
