package com.yzc.dao.service;

import com.yzc.dao.AccountDao;
import com.yzc.entity.Account;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class AccountService implements AccountDao {
    private SqlSessionFactory factory;
    public AccountService(SqlSessionFactory factory){
        this.factory = factory;
    }


    @Override
    public List<Account> findAll() {
        //根据factory获取Sqlsession对象
        SqlSession session = factory.openSession();
        //调用SqlSession中的方法，实现查询。
        List<Account> Accounts = session.selectList("com.yzc.dao.AccountDao.findAll");
        session.close();
        return Accounts;
    }

    @Override
    public void insert(Account record) {
        SqlSession session = factory.openSession();
        session.insert("com.yzc.dao.AccountDao.insert",record);
        //提交事务
        session.commit();
        session.close();
    }

    @Override
    public void deleteByPrimaryKey(String id) {
        SqlSession session = factory.openSession();
        session.update("com.yzc.dao.AccountDao.deleteByPrimaryKey",id);
        session.commit();
        session.close();
    }

    @Override
    public void updateByPrimaryKey(Account account) {
        SqlSession session = factory.openSession();
        session.update("com.yzc.dao.AccountDao.updateByPrimaryKey",account);
        session.commit();
        session.close();
    }

    @Override
    public Account selectByPrimaryKey(String id) {
        SqlSession session = factory.openSession();
        Account account = session.selectOne("com.yzc.dao.AccountDao.selectByPrimaryKey",id);
        session.close();
        return account;
    }

    @Override
    public List<Account> selectByName(String name) {
        SqlSession session = factory.openSession();
        List<Account> lists = session.selectList("com.yzc.dao.AccountDao.selectByName",name);
        session.close();
        return lists;
    }

    @Override
    public void transfer(Account account) {
        SqlSession session = factory.openSession();
        session.update("com.yzc.dao.AccountDao.transfer",account);
        session.commit();
        session.close();
    }
}
