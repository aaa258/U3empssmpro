package com.team.emp.mapper;

import com.team.emp.entity.Emp;
import com.team.emp.entity.EmpExample;
import java.util.List;

public interface EmpMapper {
    int deleteByPrimaryKey(Integer eid);

    int insert(Emp record);

    int insertSelective(Emp record);

    List<Emp> selectByExample(EmpExample example);

    Emp selectByPrimaryKey(Integer eid);

    int updateByPrimaryKeySelective(Emp record);

    int updateByPrimaryKey(Emp record);
}