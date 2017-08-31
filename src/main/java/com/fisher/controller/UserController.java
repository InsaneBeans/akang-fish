package com.fisher.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fisher.domain.User;
import com.fisher.service.UserService;

@Controller
public class UserController {
    
    @Autowired
    private UserService userService;
    
    @RequestMapping("/userList")
    public String getAllUsers(Model model) {
        List<User> users = userService.getAllUsers();
        model.addAttribute("users", users);
        return "user";
    }

}
