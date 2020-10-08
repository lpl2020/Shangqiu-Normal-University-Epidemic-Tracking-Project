package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.SchemaTableLockWaitsWithBLOBs;

public interface SchemaTableLockWaitsMapper {
    int insert(SchemaTableLockWaitsWithBLOBs record);

    int insertSelective(SchemaTableLockWaitsWithBLOBs record);
}