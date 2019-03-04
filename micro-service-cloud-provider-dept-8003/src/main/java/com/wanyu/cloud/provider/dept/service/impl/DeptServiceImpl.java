package com.wanyu.cloud.provider.dept.service.impl;

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
    public Dept get(Long id) {
        return deptMapper.findById(id);
    }

    @Override
    public List<Dept> list() {
        return deptMapper.findAll();
    }
}
