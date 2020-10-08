package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.StudentAttribute;

public interface StudentAttributeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StudentAttribute record);

    int insertSelective(StudentAttribute record);

    StudentAttribute selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StudentAttribute record);

    int updateByPrimaryKey(StudentAttribute record);
}