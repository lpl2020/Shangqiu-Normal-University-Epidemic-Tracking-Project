package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.XSchemaFlattenedKeys;

public interface XSchemaFlattenedKeysMapper {
    int insert(XSchemaFlattenedKeys record);

    int insertSelective(XSchemaFlattenedKeys record);
}