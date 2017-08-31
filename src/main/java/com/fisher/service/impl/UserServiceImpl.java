package com.fisher.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.fisher.domain.User;
import com.fisher.mapper.UserMapper;
import com.fisher.service.UserService;

@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {
    
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUser(String name) {
        return userMapper.getUser(name);
    }

    @Override
    public List<User> searchUsers(String key) {
        return userMapper.searchUsers(key);
    }

    @Override
    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }

}
