package com.wanyu.cloud.provider.dept;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by Wan on 2018/12/23.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProviderDept8003App {

    public static void main(String[] args) {
        SpringApplication.run(ProviderDept8003App.class,args);
    }
}
