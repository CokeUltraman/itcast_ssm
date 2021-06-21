package com.itcast.service;

import com.itcast.domain.Account;

import java.io.IOException;
import java.util.List;

public interface AccountService {
    public void save(Account account) ;
    public List<Account> findAll() ;
}
