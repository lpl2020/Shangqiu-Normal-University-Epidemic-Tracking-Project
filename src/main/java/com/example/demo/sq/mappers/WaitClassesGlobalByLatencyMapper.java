package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.WaitClassesGlobalByLatencyWithBLOBs;

public interface WaitClassesGlobalByLatencyMapper {
    int insert(WaitClassesGlobalByLatencyWithBLOBs record);

    int insertSelective(WaitClassesGlobalByLatencyWithBLOBs record);
}