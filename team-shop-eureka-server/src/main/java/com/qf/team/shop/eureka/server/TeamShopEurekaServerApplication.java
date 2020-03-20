package com.qf.team.shop.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TeamShopEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TeamShopEurekaServerApplication.class, args);
    }

}
