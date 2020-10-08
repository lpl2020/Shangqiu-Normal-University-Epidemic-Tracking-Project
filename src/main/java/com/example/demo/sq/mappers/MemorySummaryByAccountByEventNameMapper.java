package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.MemorySummaryByAccountByEventName;

public interface MemorySummaryByAccountByEventNameMapper {
    int insert(MemorySummaryByAccountByEventName record);

    int insertSelective(MemorySummaryByAccountByEventName record);
}