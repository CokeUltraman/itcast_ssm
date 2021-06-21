package com.itcast.service.impl;

import com.itcast.domain.Account;
import com.itcast.mapper.AccountMapper;
import com.itcast.service.AccountService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public void save(Account account) {

//        try {
//            InputStream resourceAsStream= Resources.getResourceAsStream("sqlMapConfig.xml");
//            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
//            SqlSession sqlSession = sqlSessionFactory.openSession(true);
//            AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
//            mapper.save(account);
//            sqlSession.commit();
//            sqlSession.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        accountMapper.save(account);


    }

    @Override
    public List<Account> findAll() {


//        try {
//            InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
//            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
//            SqlSession sqlSession = sqlSessionFactory.openSession(true);
//            AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
//            List<Account> accountList = mapper.findAll();
//
//            sqlSession.close();
//
//            return accountList;
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
        List<Account> accountList = accountMapper.findAll();
        return accountList;
    }
}