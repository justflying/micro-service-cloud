package com.wanyu.cloud.provider.dept.service;

import com.wanyu.cloud.entities.Dept;

import java.util.List;

/**
 * Created by Wan on 2018/12/23.
 */
public interface DeptService {
    public boolean add(Dept dept);

    public Dept get(Long id);

    public List<Dept> list();
}
