package com.register.university.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {



    @Autowired
    public IndexController() {


    }

    @RequestMapping("/")
    String land(){


        return "index";
    }
}
