package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.TimeZoneLeapSecond;

public interface TimeZoneLeapSecondMapper {
    int deleteByPrimaryKey(Long transitionTime);

    int insert(TimeZoneLeapSecond record);

    int insertSelective(TimeZoneLeapSecond record);

    TimeZoneLeapSecond selectByPrimaryKey(Long transitionTime);

    int updateByPrimaryKeySelective(TimeZoneLeapSecond record);

    int updateByPrimaryKey(TimeZoneLeapSecond record);
}