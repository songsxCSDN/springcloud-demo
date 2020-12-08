package com.ssx.service.impl;

import com.ssx.dao.UserMapper;
import com.ssx.entity.User;
import com.ssx.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;


    @Override
    public void insert(User user) {
        userMapper.insert(user);
    }

    @Override
    public void deleteByPrimaryKey(Integer id) {
        userMapper.deleteByPrimaryKey(id);
    }


    @Override
    public void update(User user) {
        userMapper.update(user);
    }

    @Override
    public User selectByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}
