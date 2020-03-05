package com.team.emp.mapper;

import com.team.emp.entity.Dept;
import com.team.emp.entity.DeptExample;
import java.util.List;

public interface DeptMapper {
    int deleteByPrimaryKey(Integer did);

    int insert(Dept record);

    int insertSelective(Dept record);

    List<Dept> selectByExample(DeptExample example);

    Dept selectByPrimaryKey(Integer did);

    int updateByPrimaryKeySelective(Dept record);

    int updateByPrimaryKey(Dept record);
}