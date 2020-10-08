package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.SchemaUnusedIndexes;

public interface SchemaUnusedIndexesMapper {
    int insert(SchemaUnusedIndexes record);

    int insertSelective(SchemaUnusedIndexes record);
}