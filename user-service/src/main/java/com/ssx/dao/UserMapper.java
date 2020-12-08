package com.ssx.dao;

import com.ssx.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserMapper {

    void insert(User user);
    void deleteByPrimaryKey(Integer id);
    void update(User user);
    User selectByPrimaryKey(Integer id);
    List<User> findAll();
}
