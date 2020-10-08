package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.Parameters;

public interface ParametersMapper {
    int insert(Parameters record);

    int insertSelective(Parameters record);
}