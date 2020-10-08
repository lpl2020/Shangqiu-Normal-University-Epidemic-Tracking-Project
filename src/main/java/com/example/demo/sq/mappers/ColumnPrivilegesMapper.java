package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.ColumnPrivileges;

public interface ColumnPrivilegesMapper {
    int insert(ColumnPrivileges record);

    int insertSelective(ColumnPrivileges record);
}