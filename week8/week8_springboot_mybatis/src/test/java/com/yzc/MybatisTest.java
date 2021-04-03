package com.yzc;

import com.yzc.entity.Account;
import com.yzc.mapper.AccountDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootApplication.class)
public class MybatisTest {
    @Autowired
    private AccountDao accountDao;
    @Test
    public void findAll(){
        List<Account> accounts = accountDao.findAll();
        System.out.println(accounts);
    }
    @Test
    public void delete(){
        String id= "1";
        accountDao.deleteByPrimaryKey(id);
    }
    @Test
    public void insert(){
        Account account = new Account();
        account.setId("1");
        account.setName("Alen");
        account.setMoney(2000);
        account.setUpdatetime(new Date());
        account.setCreatetime(new Date());
        accountDao.insert(account);
    }
    @Test
    public void selectByPrimaryKey(){
        String id = "2";
        Account account = new Account();
        account = accountDao.selectByPrimaryKey(id);
        System.out.println(account);
    }
    @Test
    public void updateByPrimaryKey(){
        Account account = new Account();
        account.setId("1");
        account.setMoney(800);
        account.setUpdatetime(new Date());
        accountDao.updateByPrimaryKey(account);
    }
}
