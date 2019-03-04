package com.wanyu.cloud.eureka.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by Wan on 2018/12/23.
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7001App {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7001App.class,args);
    }
}
