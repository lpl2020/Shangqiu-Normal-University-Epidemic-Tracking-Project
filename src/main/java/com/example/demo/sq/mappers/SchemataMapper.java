package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.Schemata;

public interface SchemataMapper {
    int insert(Schemata record);

    int insertSelective(Schemata record);
}