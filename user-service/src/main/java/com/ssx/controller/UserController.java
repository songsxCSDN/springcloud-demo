package com.ssx.controller;

import com.ssx.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by macro on 2019/8/29.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private Logger LOGGER = LoggerFactory.getLogger(this.getClass());


    @GetMapping("/{id}")
    public String getUser(@PathVariable Long id) {
        User user = new User();
        user.setUsername("王尼玛");
        user.setPassword("我尼玛");
        LOGGER.info("根据id获取用户信息，用户名称为：{}",user.getUsername());
        return user.toString();
    }

}


