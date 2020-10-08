package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.IoGlobalByWaitByLatencyWithBLOBs;

public interface IoGlobalByWaitByLatencyMapper {
    int insert(IoGlobalByWaitByLatencyWithBLOBs record);

    int insertSelective(IoGlobalByWaitByLatencyWithBLOBs record);
}