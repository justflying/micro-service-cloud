package com.wanyu.cloud.config.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Wan on 2019/2/28.
 */
@RestController
public class ConfigController {

    @Value("${spring.application.name}")
    private String  applicationName;

    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaServers;

    @Value("${server.port}")
    private String port;

    @GetMapping("/config")
    public String getConfig(){
        return "applicationName: "+applicationName+"  eurekaServers: "+eurekaServers+"  port: "+port;
    }
}
