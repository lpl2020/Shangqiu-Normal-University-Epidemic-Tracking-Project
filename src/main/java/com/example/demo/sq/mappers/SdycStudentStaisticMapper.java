package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.SdycStudentStaistic;

public interface SdycStudentStaisticMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SdycStudentStaistic record);

    int insertSelective(SdycStudentStaistic record);

    SdycStudentStaistic selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SdycStudentStaistic record);

    int updateByPrimaryKey(SdycStudentStaistic record);
}