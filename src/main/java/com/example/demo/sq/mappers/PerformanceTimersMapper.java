package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.PerformanceTimers;

public interface PerformanceTimersMapper {
    int insert(PerformanceTimers record);

    int insertSelective(PerformanceTimers record);
}