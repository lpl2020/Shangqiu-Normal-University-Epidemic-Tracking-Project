package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.XInnodbBufferStatsBySchema;

public interface XInnodbBufferStatsBySchemaMapper {
    int insert(XInnodbBufferStatsBySchema record);

    int insertSelective(XInnodbBufferStatsBySchema record);
}