package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.XSchemaTablesWithFullTableScans;

public interface XSchemaTablesWithFullTableScansMapper {
    int insert(XSchemaTablesWithFullTableScans record);

    int insertSelective(XSchemaTablesWithFullTableScans record);
}