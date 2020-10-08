package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.XSchemaIndexStatistics;

public interface XSchemaIndexStatisticsMapper {
    int insert(XSchemaIndexStatistics record);

    int insertSelective(XSchemaIndexStatistics record);
}