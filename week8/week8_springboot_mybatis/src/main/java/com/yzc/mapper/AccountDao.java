package com.yzc.dao;

import com.yzc.entity.Account;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface AccountDao {
    //1查询所有记录
    public List<Account> findAll();
    //2通过id删除记录
    public void deleteByPrimaryKey(String id);
    //3插入记录
    public void insert(Account record);
    //4通过id找对象
    public Account selectByPrimaryKey(String id);
    //5更新Account
    public void updateByPrimaryKey(Account record);
}
