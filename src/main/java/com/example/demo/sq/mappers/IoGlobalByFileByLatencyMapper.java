package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.IoGlobalByFileByLatencyWithBLOBs;

public interface IoGlobalByFileByLatencyMapper {
    int insert(IoGlobalByFileByLatencyWithBLOBs record);

    int insertSelective(IoGlobalByFileByLatencyWithBLOBs record);
}