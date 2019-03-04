package com.wanyu.cloud.provider.dept.mapper;

import com.wanyu.cloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by Wan on 2018/12/23.
 */
@Mapper
public interface DeptMapper {

    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}

