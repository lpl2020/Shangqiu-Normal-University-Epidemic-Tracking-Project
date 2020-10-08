package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.SchemaTableStatisticsWithBufferWithBLOBs;

public interface SchemaTableStatisticsWithBufferMapper {
    int insert(SchemaTableStatisticsWithBufferWithBLOBs record);

    int insertSelective(SchemaTableStatisticsWithBufferWithBLOBs record);
}