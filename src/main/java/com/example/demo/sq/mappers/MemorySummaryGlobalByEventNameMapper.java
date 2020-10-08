package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.MemorySummaryGlobalByEventName;

public interface MemorySummaryGlobalByEventNameMapper {
    int insert(MemorySummaryGlobalByEventName record);

    int insertSelective(MemorySummaryGlobalByEventName record);
}