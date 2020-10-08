package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.OptimizerTraceWithBLOBs;

public interface OptimizerTraceMapper {
    int insert(OptimizerTraceWithBLOBs record);

    int insertSelective(OptimizerTraceWithBLOBs record);
}