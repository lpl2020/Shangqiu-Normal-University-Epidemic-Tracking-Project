package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.ProcesslistWithBLOBs;

public interface ProcesslistMapper {
    int insert(ProcesslistWithBLOBs record);

    int insertSelective(ProcesslistWithBLOBs record);
}