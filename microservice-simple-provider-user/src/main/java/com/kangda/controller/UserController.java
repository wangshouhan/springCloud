package com.kangda.controller;

import com.kangda.bean.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by shouhan on 2017/8/29.
 */
@RestController
public class UserController {
    @GetMapping("/{id}")
    public User findById(@PathVariable long id){
        User user = new User();
        user.setId(1l);
        user.setAge(20);
        user.setName("wangshouhan");
        return user;
    };
}
