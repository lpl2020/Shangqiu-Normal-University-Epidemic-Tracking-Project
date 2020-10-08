package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.VariablesByThread;

public interface VariablesByThreadMapper {
    int insert(VariablesByThread record);

    int insertSelective(VariablesByThread record);
}