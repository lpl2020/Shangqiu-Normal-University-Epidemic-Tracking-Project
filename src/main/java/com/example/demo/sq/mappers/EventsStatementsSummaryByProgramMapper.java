package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.EventsStatementsSummaryByProgram;

public interface EventsStatementsSummaryByProgramMapper {
    int insert(EventsStatementsSummaryByProgram record);

    int insertSelective(EventsStatementsSummaryByProgram record);
}