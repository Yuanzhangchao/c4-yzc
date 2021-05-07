package com.yzc.controller;

import com.sun.org.apache.bcel.internal.generic.RET;
import com.yzc.entity.Account;
import com.yzc.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
@RestController
public class AccountController {
    @Autowired
    private AccountDao accountDao;

    @RequestMapping("/list")
    public List<Account> findAll(){

        List<Account> accounts = accountDao.findAll();
        return accounts;
    }

    @RequestMapping("/account/save")
    public void insert(@RequestBody Account account){
        accountDao.insert(account);
    }

    @RequestMapping("/account/transfer")
    public void transfer(@RequestParam("remitterId") String remitterId,
                         @RequestParam("remitteeId") String remitteeId,
                         @RequestParam("money") int money){
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
