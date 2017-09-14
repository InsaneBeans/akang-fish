package com.fisher.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fisher.HuApplication;
import com.fisher.domain.User;
import com.fisher.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = HuApplication.class)
public class TestService {
    
    @Autowired
    private UserService userService;
    
    @Test
    public void testGetUsers() {
        List<User> users = userService.getAllUsers();
        for (User user : users) {
            System.out.println(user.getName());
        }
    }
}
