package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.ColumnsWithBLOBs;

public interface ColumnsMapper {
    int insert(ColumnsWithBLOBs record);

    int insertSelective(ColumnsWithBLOBs record);
}