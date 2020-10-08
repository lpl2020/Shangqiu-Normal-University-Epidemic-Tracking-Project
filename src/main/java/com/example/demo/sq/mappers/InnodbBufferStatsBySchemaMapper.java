package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.InnodbBufferStatsBySchemaWithBLOBs;

public interface InnodbBufferStatsBySchemaMapper {
    int insert(InnodbBufferStatsBySchemaWithBLOBs record);

    int insertSelective(InnodbBufferStatsBySchemaWithBLOBs record);
}