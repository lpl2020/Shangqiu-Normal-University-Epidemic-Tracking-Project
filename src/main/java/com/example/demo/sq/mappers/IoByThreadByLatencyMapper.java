package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.IoByThreadByLatencyWithBLOBs;

public interface IoByThreadByLatencyMapper {
    int insert(IoByThreadByLatencyWithBLOBs record);

    int insertSelective(IoByThreadByLatencyWithBLOBs record);
}