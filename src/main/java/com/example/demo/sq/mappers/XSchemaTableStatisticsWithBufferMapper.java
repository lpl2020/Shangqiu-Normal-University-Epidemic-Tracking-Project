package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.XSchemaTableStatisticsWithBuffer;

public interface XSchemaTableStatisticsWithBufferMapper {
    int insert(XSchemaTableStatisticsWithBuffer record);

    int insertSelective(XSchemaTableStatisticsWithBuffer record);
}