package com.qf.team.shop.web.register.controller;

import com.qf.team.shop.web.register.service.registerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class registerController {

    @Autowired
    private registerService service;

    @ResponseBody
    @RequestMapping("register")
    public String register(String msg){
        return service.register(msg);
    }

}
