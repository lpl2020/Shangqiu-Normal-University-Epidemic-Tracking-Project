package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.XSchemaTableLockWaitsWithBLOBs;

public interface XSchemaTableLockWaitsMapper {
    int insert(XSchemaTableLockWaitsWithBLOBs record);

    int insertSelective(XSchemaTableLockWaitsWithBLOBs record);
}