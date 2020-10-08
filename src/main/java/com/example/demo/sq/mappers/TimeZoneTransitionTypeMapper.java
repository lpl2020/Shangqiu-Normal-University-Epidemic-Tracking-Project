package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.TimeZoneTransitionType;
import com.example.demo.sq.entity.TimeZoneTransitionTypeKey;

public interface TimeZoneTransitionTypeMapper {
    int deleteByPrimaryKey(TimeZoneTransitionTypeKey key);

    int insert(TimeZoneTransitionType record);

    int insertSelective(TimeZoneTransitionType record);

    TimeZoneTransitionType selectByPrimaryKey(TimeZoneTransitionTypeKey key);

    int updateByPrimaryKeySelective(TimeZoneTransitionType record);

    int updateByPrimaryKey(TimeZoneTransitionType record);
}