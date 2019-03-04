package com.wanyu.cloud.service;

import com.wanyu.cloud.entities.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Wan on 2019/1/21.
 */
@FeignClient(value="PROVIDER-DEPT")
public interface DeptClientService {

    @PostMapping(value = "/dept/add")
    public boolean add(Dept dept);

    @GetMapping(value = "/dept/get/{id}")
    public Dept get(@PathVariable("id")Long id);

    @GetMapping(value = "/dept/list")
    public List<Dept> list();
}
