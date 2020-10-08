package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.WaitsByHostByLatencyWithBLOBs;

public interface WaitsByHostByLatencyMapper {
    int insert(WaitsByHostByLatencyWithBLOBs record);

    int insertSelective(WaitsByHostByLatencyWithBLOBs record);
}