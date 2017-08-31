package com.fisher.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    
    @RequestMapping("/")
    public String index() {
        return "index";
    }
    
    @RequestMapping("/about/lj")
    public String welcome() {
        return "part/about-lj";
    }

}
