package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.XSchemaTableStatistics;

public interface XSchemaTableStatisticsMapper {
    int insert(XSchemaTableStatistics record);

    int insertSelective(XSchemaTableStatistics record);
}