package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.XStatementsWithTempTables;

public interface XStatementsWithTempTablesMapper {
    int insert(XStatementsWithTempTables record);

    int insertSelective(XStatementsWithTempTables record);
}