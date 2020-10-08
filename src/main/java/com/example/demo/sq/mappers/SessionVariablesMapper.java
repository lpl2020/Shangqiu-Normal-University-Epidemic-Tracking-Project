package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.SessionVariables;

public interface SessionVariablesMapper {
    int insert(SessionVariables record);

    int insertSelective(SessionVariables record);
}