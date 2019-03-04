package com.wanyu.cloud.consumer.dept;

import com.wanyu.cloud.consumer.config.MyConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Wan on 2018/12/23.
 */
@SpringBootApplication
//@EnableDiscoveryClient 这个是SpringCloud自己的服务注册与发现，
@EnableEurekaClient
@RibbonClient(name="PROVIDER-DEPT",configuration = MyConfiguration.class)
public class ConsumerDept9001App {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    public static void main( String[] args )
    {
        SpringApplication.run(ConsumerDept9001App.class,args);
    }
}
