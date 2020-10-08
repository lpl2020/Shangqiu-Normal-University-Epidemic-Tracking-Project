package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.StatementsWithErrorsOrWarnings;

public interface StatementsWithErrorsOrWarningsMapper {
    int insert(StatementsWithErrorsOrWarnings record);

    int insertSelective(StatementsWithErrorsOrWarnings record);
}