package com.wanyu.cloud.consumer.dept;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by Wan on 2019/1/21.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages ={"com.wanyu.cloud.service"})
public class ConsumerDept9002App {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerDept9002App.class,args);
    }
}
