package org.txazo.shardingjdbc.sample.service.impl;

import org.apache.shardingsphere.api.hint.HintManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.txazo.shardingjdbc.sample.entity.User;
import org.txazo.shardingjdbc.sample.repository.UserRepository;
import org.txazo.shardingjdbc.sample.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public int addUser(User user) {
        return userRepository.addUser(user);
    }

    @Override
    public User getUser(Integer id) {
        // HintManager.getInstance().setMasterRouteOnly();
        return userRepository.getUser(id);
    }

}
