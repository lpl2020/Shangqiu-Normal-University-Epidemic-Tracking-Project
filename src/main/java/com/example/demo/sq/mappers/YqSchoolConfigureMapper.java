package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.YqSchoolConfigure;

public interface YqSchoolConfigureMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YqSchoolConfigure record);

    int insertSelective(YqSchoolConfigure record);

    YqSchoolConfigure selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YqSchoolConfigure record);

    int updateByPrimaryKey(YqSchoolConfigure record);
}