package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.MemorySummaryByHostByEventName;

public interface MemorySummaryByHostByEventNameMapper {
    int insert(MemorySummaryByHostByEventName record);

    int insertSelective(MemorySummaryByHostByEventName record);
}