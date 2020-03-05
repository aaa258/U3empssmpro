package com.team.emp.service;

import com.github.pagehelper.PageInfo;
import com.team.emp.entity.Emp;
import com.team.emp.util.PageCondition;

public interface EmpService {
    public PageInfo<Emp> getAllEmpInfo(PageCondition pageCondition);
    public int addEmpInfo(Emp emp);
    public Emp getOneEmp(Integer eid);
    public int updatemp(Emp emp);
    public int deletemp(Integer eid);
}
