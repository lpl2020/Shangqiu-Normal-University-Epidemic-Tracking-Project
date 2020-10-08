package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.WaitClassesGlobalByAvgLatencyWithBLOBs;

public interface WaitClassesGlobalByAvgLatencyMapper {
    int insert(WaitClassesGlobalByAvgLatencyWithBLOBs record);

    int insertSelective(WaitClassesGlobalByAvgLatencyWithBLOBs record);
}