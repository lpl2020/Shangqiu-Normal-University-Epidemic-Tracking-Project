package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.InnodbBufferStatsByTableWithBLOBs;

public interface InnodbBufferStatsByTableMapper {
    int insert(InnodbBufferStatsByTableWithBLOBs record);

    int insertSelective(InnodbBufferStatsByTableWithBLOBs record);
}