package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.YqSchoolDepartment;

public interface YqSchoolDepartmentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YqSchoolDepartment record);

    int insertSelective(YqSchoolDepartment record);

    YqSchoolDepartment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YqSchoolDepartment record);

    int updateByPrimaryKey(YqSchoolDepartment record);
}