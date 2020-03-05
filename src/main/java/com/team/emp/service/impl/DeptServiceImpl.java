package com.team.emp.service.impl;

import com.team.emp.entity.Dept;
import com.team.emp.entity.DeptExample;
import com.team.emp.mapper.DeptMapper;
import com.team.emp.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;
    @Override
    public List<Dept> getDeptInfo() {
        return deptMapper.selectByExample(new DeptExample());
    }
}
