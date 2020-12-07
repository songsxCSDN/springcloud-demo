package com.ssx.service.impl;

import com.ssx.entity.User;
import com.ssx.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Override
    public void create(User user) {

    }

    @Override
    public User getUser(Long id) {
        return null;
    }

    @Override
    public List<User> getUserByIds(List<Long> ids) {
        return null;
    }

    @Override
    public User getByUsername(String username) {
        return null;
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(Long id) {

    }
}
