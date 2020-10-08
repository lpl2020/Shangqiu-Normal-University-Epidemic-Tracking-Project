package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.Tablespaces;

public interface TablespacesMapper {
    int insert(Tablespaces record);

    int insertSelective(Tablespaces record);
}