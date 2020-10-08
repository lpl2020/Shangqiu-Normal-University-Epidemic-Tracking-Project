package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.TimeZone;

public interface TimeZoneMapper {
    int deleteByPrimaryKey(Integer timeZoneId);

    int insert(TimeZone record);

    int insertSelective(TimeZone record);

    TimeZone selectByPrimaryKey(Integer timeZoneId);

    int updateByPrimaryKeySelective(TimeZone record);

    int updateByPrimaryKey(TimeZone record);
}