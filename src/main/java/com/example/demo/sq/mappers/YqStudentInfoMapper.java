package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.YqStudentInfo;

public interface YqStudentInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YqStudentInfo record);

    int insertSelective(YqStudentInfo record);

    YqStudentInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YqStudentInfo record);

    int updateByPrimaryKey(YqStudentInfo record);
}