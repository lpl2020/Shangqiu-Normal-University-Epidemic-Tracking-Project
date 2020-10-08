package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.XStatementsWithFullTableScans;

public interface XStatementsWithFullTableScansMapper {
    int insert(XStatementsWithFullTableScans record);

    int insertSelective(XStatementsWithFullTableScans record);
}