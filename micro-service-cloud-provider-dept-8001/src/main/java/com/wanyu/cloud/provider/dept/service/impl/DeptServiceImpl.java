package com.wanyu.cloud.provider.dept.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.wanyu.cloud.entities.Dept;
import com.wanyu.cloud.provider.dept.mapper.DeptMapper;
import com.wanyu.cloud.provider.dept.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Wan on 2018/12/23.
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public boolean add(Dept dept) {
        return deptMapper.addDept(dept);
    }

    @Override
    @HystrixCommand(fallbackMethod = "getFallBack")
    public Dept get(Long id) {
        Dept dept = deptMapper.findById(id);
        if(dept==null){
            throw new RuntimeException("该ID不存在");
        }
        return dept;
    }

    @Override
    public List<Dept> list() {
        return deptMapper.findAll();
    }

    private Dept getFallBack(Long id) {
        return new Dept().setDeptno(-1L).setDb_source(null).setDname("该用户不存在，直接返回hystrix结果");
    }
}
