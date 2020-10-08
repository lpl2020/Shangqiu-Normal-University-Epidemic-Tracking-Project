package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.SchemaIndexStatisticsWithBLOBs;

public interface SchemaIndexStatisticsMapper {
    int insert(SchemaIndexStatisticsWithBLOBs record);

    int insertSelective(SchemaIndexStatisticsWithBLOBs record);
}