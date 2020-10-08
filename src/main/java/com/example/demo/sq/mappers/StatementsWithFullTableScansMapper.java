package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.StatementsWithFullTableScansWithBLOBs;

public interface StatementsWithFullTableScansMapper {
    int insert(StatementsWithFullTableScansWithBLOBs record);

    int insertSelective(StatementsWithFullTableScansWithBLOBs record);
}