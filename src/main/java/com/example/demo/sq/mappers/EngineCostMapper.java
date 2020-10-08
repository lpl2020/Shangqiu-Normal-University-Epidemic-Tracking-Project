package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.EngineCost;
import com.example.demo.sq.entity.EngineCostKey;

public interface EngineCostMapper {
    int deleteByPrimaryKey(EngineCostKey key);

    int insert(EngineCost record);

    int insertSelective(EngineCost record);

    EngineCost selectByPrimaryKey(EngineCostKey key);

    int updateByPrimaryKeySelective(EngineCost record);

    int updateByPrimaryKey(EngineCost record);
}