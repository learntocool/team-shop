package com.qf.team.shop.service.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class TeamShopServiceRegisterApplication {

    public static void main(String[] args) {
        SpringApplication.run(TeamShopServiceRegisterApplication.class, args);
    }

}
