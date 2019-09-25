package org.txazo.shardingjdbc.sample.repository;

import org.apache.ibatis.annotations.Mapper;
import org.txazo.shardingjdbc.sample.entity.Account;

@Mapper
public interface AccountRepository {

    int addAccount(Account account);

    Account getAccount(Integer id);

}
