package com.fisher.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fisher.domain.User;

@Service
public interface UserService {
    
    User getUser(String name);
    
    List<User> searchUsers(String key);
    
    List<User> getAllUsers();

}
