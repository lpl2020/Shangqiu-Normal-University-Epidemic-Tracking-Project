package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.MemorySummaryByThreadByEventName;

public interface MemorySummaryByThreadByEventNameMapper {
    int insert(MemorySummaryByThreadByEventName record);

    int insertSelective(MemorySummaryByThreadByEventName record);
}