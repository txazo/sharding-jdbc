package org.txazo.shardingjdbc.sample.controller;

import com.google.common.collect.ImmutableMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.txazo.shardingjdbc.sample.entity.Account;
import org.txazo.shardingjdbc.sample.service.AccountService;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("add")
    public Object add(@RequestParam String username, @RequestParam String password) {
        Account account = new Account();
        account.setUsername(username);
        account.setPassword(password);
        int id = accountService.addAccount(account);
        return ImmutableMap.of("data", id);
    }

    @GetMapping("get")
    public Object get(@RequestParam Integer id) {
        Account account = accountService.getAccount(id);
        return ImmutableMap.of("data", account);
    }

    // http://localhost:8080/account/add?username=root&password=123456
    // http://localhost:8080/account/get?id=1

}
