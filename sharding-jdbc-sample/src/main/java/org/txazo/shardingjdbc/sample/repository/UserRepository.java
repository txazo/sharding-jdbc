package org.txazo.shardingjdbc.sample.repository;

import org.apache.ibatis.annotations.Mapper;
import org.txazo.shardingjdbc.sample.entity.User;

@Mapper
public interface UserRepository {

    int addUser(User user);

    User getUser(Integer id);

}
