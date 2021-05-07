package com.yzc.dao;

import com.yzc.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface UserMapper {
    //登录
    User login(@Param("UserName") String UserName, @Param("UserPsd") String UserPsd);
}
