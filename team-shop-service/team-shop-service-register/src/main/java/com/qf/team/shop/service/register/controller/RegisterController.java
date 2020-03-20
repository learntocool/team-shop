package com.qf.team.shop.service.register.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RegisterController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("register")
    @ResponseBody
    public String register(String msg){
        return String.format("%s注册%s成功",serverPort,msg);
    }

}
