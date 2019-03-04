package com.wanyu.cloud.consumer.dept.controller;

import com.wanyu.cloud.entities.Dept;
import com.wanyu.cloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by Wan on 2018/12/23.
 */
@RestController
public class ConsumerDeptController {

    @Autowired
    private DeptClientService deptClientService;

    @PostMapping(value = "consumer/add")
    public boolean add(@RequestBody Dept dept)
    {
        return deptClientService.add(dept);
    }

    @GetMapping(value = "consumer/dept/{id}")
    public Dept get(@PathVariable("id") Long id)
    {
        return deptClientService.get(id);
    }

    @GetMapping(value = "consumer/list")
    public List<Dept> list()
    {
        return deptClientService.list();
    }
}
