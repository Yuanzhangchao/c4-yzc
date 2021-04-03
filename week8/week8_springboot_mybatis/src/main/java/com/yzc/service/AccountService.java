package com.yzc.service;

import com.yzc.entity.Account;
import com.yzc.mapper.AccountDao;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class AccountService {
    @Autowired
    private AccountDao accountDao;

    public List<Account> findAll(){
        List<Account> all = accountDao.findAll();
        return all;
    }
    public void deleteByPrimaryKey(String id){
        accountDao.deleteByPrimaryKey(id);
    }
    public void insert(Account account){
        accountDao.insert(account);
    }
    public Account selectByPrimaryKey(String id){
        Account  account = accountDao.selectByPrimaryKey(id);
        return account;
    }
    public void updateByPrimaryKey(Account account){
        accountDao.updateByPrimaryKey(account);
    }
    public void transfer(String remitterId,String remitteeId,int money){
        Date updatetime = new Date();
        Account account1 = new Account();
        account1.setId(remitterId);
        account1.setUpdatetime(updatetime);
        account1.setMoney(account1.getMoney() - money);
        accountDao.updateByPrimaryKey(account1);
        Account account2 = new Account();
        account2.setId(remitteeId);
        account2.setUpdatetime(updatetime);
        account2.setMoney(account2.getMoney() + money);
        accountDao.updateByPrimaryKey(account2);

    }
}
