package com.wanyu.cloud.consumer.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Wan on 2019/1/15.
 * 这个文件不能和@ComponentScan注解在同一个目录或者它的子目录，所以必须要放在她的上一级目录
 */
@Configuration
public class MyConfiguration {

    @Bean
    public IRule iRule(){
        return new RandomRule(); //使用随机算法
    }
}
