package com.wanyu.cloud.eureka.third;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by Wan on 2019/1/6.
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7003App {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7003App.class,args);
    }
}
