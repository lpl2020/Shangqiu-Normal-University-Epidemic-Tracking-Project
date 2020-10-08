package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.XStatementsWithErrorsOrWarnings;

public interface XStatementsWithErrorsOrWarningsMapper {
    int insert(XStatementsWithErrorsOrWarnings record);

    int insertSelective(XStatementsWithErrorsOrWarnings record);
}