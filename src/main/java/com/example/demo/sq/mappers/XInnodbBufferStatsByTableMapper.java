package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.XInnodbBufferStatsByTableWithBLOBs;

public interface XInnodbBufferStatsByTableMapper {
    int insert(XInnodbBufferStatsByTableWithBLOBs record);

    int insertSelective(XInnodbBufferStatsByTableWithBLOBs record);
}