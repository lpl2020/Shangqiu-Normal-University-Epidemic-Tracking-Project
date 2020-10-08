package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.SchemaRedundantIndexesWithBLOBs;

public interface SchemaRedundantIndexesMapper {
    int insert(SchemaRedundantIndexesWithBLOBs record);

    int insertSelective(SchemaRedundantIndexesWithBLOBs record);
}