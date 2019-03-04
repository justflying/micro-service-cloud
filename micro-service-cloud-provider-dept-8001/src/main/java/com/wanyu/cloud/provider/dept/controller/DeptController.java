package com.wanyu.cloud.provider.dept.controller;

import com.wanyu.cloud.entities.Dept;
import com.wanyu.cloud.provider.dept.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Wan on 2018/12/23.
 */
@RestController
public class DeptController {


    @Autowired
    private DeptService service;

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept)
    {
        return service.add(dept);
    }

    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id)
    {
        return service.get(id);
    }

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> list()
    {
        return service.list();
    }

    @RequestMapping("/dept/discovery")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();
        System.out.println(services);
        return this.discoveryClient;
    }
}
