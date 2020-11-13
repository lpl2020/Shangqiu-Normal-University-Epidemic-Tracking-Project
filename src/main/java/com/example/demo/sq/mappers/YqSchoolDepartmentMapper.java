package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.YqSchoolDepartment;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface YqSchoolDepartmentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YqSchoolDepartment record);

    int insertSelective(YqSchoolDepartment record);

    List<YqSchoolDepartment> getdepartlist();

    YqSchoolDepartment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YqSchoolDepartment record);

    int updateByPrimaryKey(YqSchoolDepartment record);
}