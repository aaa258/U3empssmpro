package com.team.emp.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.team.emp.entity.Emp;
import com.team.emp.entity.EmpExample;
import com.team.emp.mapper.EmpMapper;
import com.team.emp.service.EmpService;
import com.team.emp.util.PageCondition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;
    @Override
    public PageInfo<Emp> getAllEmpInfo(PageCondition pageCondition) {
        PageHelper.startPage(pageCondition.getPage(),pageCondition.getPageSize());
        EmpExample empExample=new EmpExample();
        EmpExample.Criteria criteria=empExample.createCriteria();
        if (pageCondition.getEname()!=null&&!pageCondition.getEname().equals("")){
            criteria.andEnameLike("%"+pageCondition.getEname()+"%");
        }
        if (pageCondition.getStartestartime()!=null&&!pageCondition.getStartestartime().equals("")){
            criteria.andEstartimeGreaterThan(pageCondition.getStartestartime());
        }
        if (pageCondition.getEndestartime()!=null&&!pageCondition.getEndestartime().equals("")){
            criteria.andEstartimeLessThan(pageCondition.getEndestartime());
        }
        if (pageCondition.getDid()!=null&&!pageCondition.getDid().equals("")){
            criteria.andDidEqualTo(pageCondition.getDid());
        }
        List<Emp> list=empMapper.selectByExample(empExample);
        PageInfo<Emp> pageInfo=new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public int addEmpInfo(Emp emp) {
        return empMapper.insertSelective(emp);
    }

    @Override
    public Emp getOneEmp(Integer eid) {
        return empMapper.selectByPrimaryKey(eid);
    }

    @Override
    public int updatemp(Emp emp) {
        return empMapper.updateByPrimaryKeySelective(emp);
    }

    @Override
    public int deletemp(Integer eid) {
        return empMapper.deleteByPrimaryKey(eid);
    }
}
