package org.txazo.shardingjdbc.sample.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.txazo.shardingjdbc.sample.entity.Account;
import org.txazo.shardingjdbc.sample.repository.AccountRepository;
import org.txazo.shardingjdbc.sample.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public int addAccount(Account account) {
        return accountRepository.addAccount(account);
    }

    @Override
    public Account getAccount(Integer id) {
        return accountRepository.getAccount(id);
    }

}
