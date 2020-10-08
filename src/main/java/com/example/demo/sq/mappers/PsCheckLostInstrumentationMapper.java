package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.PsCheckLostInstrumentation;

public interface PsCheckLostInstrumentationMapper {
    int insert(PsCheckLostInstrumentation record);

    int insertSelective(PsCheckLostInstrumentation record);
}