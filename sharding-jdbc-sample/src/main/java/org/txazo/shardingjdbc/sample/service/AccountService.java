package org.txazo.shardingjdbc.sample.service;

import org.txazo.shardingjdbc.sample.entity.Account;

public interface AccountService {

    int addAccount(Account account);

    Account getAccount(Integer id);

}
