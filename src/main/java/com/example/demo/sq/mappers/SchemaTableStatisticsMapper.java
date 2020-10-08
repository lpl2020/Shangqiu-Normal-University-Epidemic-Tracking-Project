package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.SchemaTableStatisticsWithBLOBs;

public interface SchemaTableStatisticsMapper {
    int insert(SchemaTableStatisticsWithBLOBs record);

    int insertSelective(SchemaTableStatisticsWithBLOBs record);
}