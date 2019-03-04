package com.wanyu.cloud.consumer.dept.controller;

import com.wanyu.cloud.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Wan on 2018/12/23.
 */
@RestController
public class ConsumerDeptController {

    //沒使用eureka的時候
   // private static final String URL_PREFIX="http://localhost:8001";

    private static final String URL_PREFIX ="http://PROVIDER-DEPT";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "consumer/dept/{id}")
    private Dept getById(@PathVariable Long id){
        return  restTemplate.getForObject(URL_PREFIX+"/dept/get/"+id,Dept.class);
    }
}
