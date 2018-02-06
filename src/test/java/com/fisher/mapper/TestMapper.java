package com.fisher.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fisher.FisherApplication;
import com.fisher.domain.User;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = FisherApplication.class)
public class TestMapper {
    
    @Autowired
    private UserMapper userMapper;
    
    @Test
    public void testGetUsers() {
        List<User> users = userMapper.getAllUsers();
        for (User user : users) {
            System.out.println("User: " + user.getId() + "," + user.getName()
                    + "," + user.getMark());
        }
    }

}
