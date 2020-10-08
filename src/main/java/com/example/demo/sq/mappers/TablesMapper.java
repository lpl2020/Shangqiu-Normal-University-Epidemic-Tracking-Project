package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.Tables;

public interface TablesMapper {
    int insert(Tables record);

    int insertSelective(Tables record);
}