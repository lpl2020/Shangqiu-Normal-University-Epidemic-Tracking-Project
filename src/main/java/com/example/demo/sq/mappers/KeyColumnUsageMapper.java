package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.KeyColumnUsage;

public interface KeyColumnUsageMapper {
    int insert(KeyColumnUsage record);

    int insertSelective(KeyColumnUsage record);
}