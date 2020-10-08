package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.GlobalVariables;

public interface GlobalVariablesMapper {
    int insert(GlobalVariables record);

    int insertSelective(GlobalVariables record);
}