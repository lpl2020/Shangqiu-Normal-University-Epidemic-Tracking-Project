package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.StatementsWithTempTablesWithBLOBs;

public interface StatementsWithTempTablesMapper {
    int insert(StatementsWithTempTablesWithBLOBs record);

    int insertSelective(StatementsWithTempTablesWithBLOBs record);
}