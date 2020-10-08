package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.MemorySummaryByUserByEventName;

public interface MemorySummaryByUserByEventNameMapper {
    int insert(MemorySummaryByUserByEventName record);

    int insertSelective(MemorySummaryByUserByEventName record);
}