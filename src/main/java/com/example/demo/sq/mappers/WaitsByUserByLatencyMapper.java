package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.WaitsByUserByLatencyWithBLOBs;

public interface WaitsByUserByLatencyMapper {
    int insert(WaitsByUserByLatencyWithBLOBs record);

    int insertSelective(WaitsByUserByLatencyWithBLOBs record);
}