package com.ssx.service;

import com.ssx.entity.User;

import java.util.List;

public interface UserService {

    void insert(User user);
    void deleteByPrimaryKey(Integer id);
    void update(User user);
    User selectByPrimaryKey(Integer id);
    List<User> findAll();
}
