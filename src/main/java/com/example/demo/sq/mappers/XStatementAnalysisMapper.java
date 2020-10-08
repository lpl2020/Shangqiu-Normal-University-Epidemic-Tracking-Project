package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.XStatementAnalysis;

public interface XStatementAnalysisMapper {
    int insert(XStatementAnalysis record);

    int insertSelective(XStatementAnalysis record);
}