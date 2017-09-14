package com.fisher.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {
    
    @RequestMapping("/admin")
    public String indexController() {
        return "redirect:/admin/admin";
    }
    
    @RequestMapping("/goods/list")
    public String goodsList() {
        return "admin/goods/goodList";
    }
    
    @RequestMapping("/users/list")
    public String usersList() {
        return "admin/user/userList";
    }

}
