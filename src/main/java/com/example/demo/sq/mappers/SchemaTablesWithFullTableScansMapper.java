package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.SchemaTablesWithFullTableScans;

public interface SchemaTablesWithFullTableScansMapper {
    int insert(SchemaTablesWithFullTableScans record);

    int insertSelective(SchemaTablesWithFullTableScans record);
}