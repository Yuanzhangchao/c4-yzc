package com.yzc.dao;

import com.yzc.entity.Account;

import java.util.List;

public interface AccountDao {
    /*查询所有*/
    List<Account> findAll();
    /*插入信息*/
    void insert(Account record);
    /*删除信息*/
    void deleteByPrimaryKey(String id);
    /*更新Account*/
    void updateByPrimaryKey(Account account);
    /*通过id查询一个信息*/
    Account selectByPrimaryKey(String id);
    /*通过名字模糊查询*/
    List<Account> selectByName(String name);
    /*转账*/
    void transfer(Account account);


}
