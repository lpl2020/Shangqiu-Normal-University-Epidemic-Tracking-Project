package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.SchemaObjectOverview;

public interface SchemaObjectOverviewMapper {
    int insert(SchemaObjectOverview record);

    int insertSelective(SchemaObjectOverview record);
}