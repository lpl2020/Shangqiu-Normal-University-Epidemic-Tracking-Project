package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.WaitsGlobalByLatencyWithBLOBs;

public interface WaitsGlobalByLatencyMapper {
    int insert(WaitsGlobalByLatencyWithBLOBs record);

    int insertSelective(WaitsGlobalByLatencyWithBLOBs record);
}