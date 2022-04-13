package com.register.university.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {


    @RequestMapping("/")
    public String land(){

        return "index";
    }


    @GetMapping("/registerBachelor")
    public String registerBachelor(){

        return "registrationPageBachelor";
    }

    @GetMapping("/registerMaster")
    public String registerMaster(){

        return "registrationPageMaster";
    }
}
