package com.wanyu.cloud.provider.dept;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * Created by Wan on 2018/12/23.
 */
//@SpringBootApplication 开启springboot
//@EnableDiscoveryClient  开启服务发现
//@EnableCircuitBreaker   开启hystrix
@SpringCloudApplication  //这个注解可以直接取代上面的三个
public class ProviderDept8001App {

    public static void main(String[] args) {
        SpringApplication.run(ProviderDept8001App.class,args);
    }
}
