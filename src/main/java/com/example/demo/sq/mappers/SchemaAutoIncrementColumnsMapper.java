package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.SchemaAutoIncrementColumns;

public interface SchemaAutoIncrementColumnsMapper {
    int insert(SchemaAutoIncrementColumns record);

    int insertSelective(SchemaAutoIncrementColumns record);
}