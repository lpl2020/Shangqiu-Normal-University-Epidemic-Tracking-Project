package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.TimeZoneTransition;
import com.example.demo.sq.entity.TimeZoneTransitionKey;

public interface TimeZoneTransitionMapper {
    int deleteByPrimaryKey(TimeZoneTransitionKey key);

    int insert(TimeZoneTransition record);

    int insertSelective(TimeZoneTransition record);

    TimeZoneTransition selectByPrimaryKey(TimeZoneTransitionKey key);

    int updateByPrimaryKeySelective(TimeZoneTransition record);

    int updateByPrimaryKey(TimeZoneTransition record);
}