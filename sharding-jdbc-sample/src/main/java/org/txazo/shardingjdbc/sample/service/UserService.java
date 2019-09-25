package org.txazo.shardingjdbc.sample.service;

import org.txazo.shardingjdbc.sample.entity.User;

public interface UserService {

    int addUser(User user);

    User getUser(Integer id);

}
