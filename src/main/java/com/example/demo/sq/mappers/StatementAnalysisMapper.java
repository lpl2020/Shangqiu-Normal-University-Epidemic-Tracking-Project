package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.StatementAnalysisWithBLOBs;

public interface StatementAnalysisMapper {
    int insert(StatementAnalysisWithBLOBs record);

    int insertSelective(StatementAnalysisWithBLOBs record);
}