package com.ssx.controller;

import com.ssx.entity.User;
import com.ssx.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/user")
public class UserController {

    private Logger LOGGER = LoggerFactory.getLogger(this.getClass());
    @Resource
    private UserService userService;

    @GetMapping("/{id}")
    public String getUser(@PathVariable Integer id) {
        System.out.println(id);
        User user = userService.selectByid(id);
        System.out.println(id);
        LOGGER.info("根据id获取用户信息，用户名称为：{}",user.getUsername());
        return user.toString();
    }

}


