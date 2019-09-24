package org.txazo.shardingjdbc.sample.controller;

import com.google.common.collect.ImmutableMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.txazo.shardingjdbc.sample.bean.User;
import org.txazo.shardingjdbc.sample.mapper.UserMapper;

import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @ResponseBody
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Map add(String nickname, String gender, Integer age) {
        User user = new User();
        user.setNickname(nickname);
        user.setGender(gender);
        user.setAge(age);
        int id = userMapper.addUser(user);
        return ImmutableMap.of("id", id);
    }

    @ResponseBody
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public User get(@PathVariable("id") Integer id) {
        return userMapper.getUser(id);
    }

}
