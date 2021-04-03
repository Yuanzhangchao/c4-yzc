package com.yzc.test;

import com.yzc.dao.AccountDao;
import com.yzc.dao.service.AccountService;
import com.yzc.entity.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class MybatisTest {
    private InputStream in;
    private  AccountDao accountDao;

    @After//测试方式执行之后执行
    public void destroy() throws Exception {
        in.close();
    }

    @Before //测试方法执行之前执行
    public void init() throws IOException {
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //使用工厂对象，创建dao对象
         accountDao = new AccountService(factory);
    }
    @Test
    /*查询所有学生*/
    public void testFindAll(){
        List<Account> accounts = accountDao.findAll();
        for(Account account : accounts){
            System.out.println(account);
        }

    }
    @Test
    /*添加信息*/
    public void testInsert() throws  ParseException {

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String time = df.format(new Date());
        Date date = df.parse(time);
        accountDao.insert(new Account("1","jack",1000,date,date));
        accountDao.insert(new Account("2","tom",500,date,date));
        accountDao.insert(new Account("4","Helen",500,date,date));

    }
    @Test
    /*更新Account*/
    public void testUpdateByPrimaryKey(){
        Account account = new Account();
        account.setId("2");
        account.setUpdatetime(new Date());
        account.setMoney(1500);
        accountDao.updateByPrimaryKey(account);
    }
    @Test
    /*删除信息*/
    public void testDeleteByprimaryKey(){
        String  id = "3";
        accountDao.deleteByPrimaryKey(id);
    }
    @Test
    /*根据ID查询单个的信息*/
    public void testSelectByPrimaryKey(){
        String id = "2";
        Account account = accountDao.selectByPrimaryKey(id);
        System.out.println(account);
    }
    @Test
    /*通过名字模糊查询*/
    public void testSelectByName(){
        String name = "%o%";
        List<Account> accounts = accountDao.selectByName(name);
        for(Account account : accounts){
            System.out.println(account);
        }
    }

    @Test
    /*转账功能*/
    public void transfer(){
        String remitterId = "1";
        String remitteeId = "2";
        int money = 500;
        Account account1 = new Account();
        account1.setId(remitterId);
        account1.setMoney(money);
        account1.setUpdatetime(new Date());
        Account account2 = new Account();
        account2.setId(remitteeId);
        account2.setMoney(-money);
        account2.setUpdatetime(new Date());
        accountDao.transfer(account1);
        accountDao.transfer(account2);
    }

}
