package org.txazo.shardingjdbc.sample.controller;

import com.google.common.collect.ImmutableMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.txazo.shardingjdbc.sample.entity.User;
import org.txazo.shardingjdbc.sample.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("add")
    public Object add(@RequestParam String nickname, @RequestParam String gender, @RequestParam Integer age) {
        User user = new User();
        user.setNickname(nickname);
        user.setGender(gender);
        user.setAge(age);
        int id = userService.addUser(user);
        return ImmutableMap.of("data", id);
    }

    @GetMapping("get")
    public Object get(@RequestParam Integer id) {
        User user = userService.getUser(id);
        return ImmutableMap.of("data", user);
    }

    // http://localhost:8080/user/add?nickname=root&gender=M&age=25
    // http://localhost:8080/user/get?id=1

}
