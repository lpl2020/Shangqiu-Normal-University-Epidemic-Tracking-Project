package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.TimeZoneName;

public interface TimeZoneNameMapper {
    int deleteByPrimaryKey(String name);

    int insert(TimeZoneName record);

    int insertSelective(TimeZoneName record);

    TimeZoneName selectByPrimaryKey(String name);

    int updateByPrimaryKeySelective(TimeZoneName record);

    int updateByPrimaryKey(TimeZoneName record);
}