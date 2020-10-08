package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.TablePrivileges;

public interface TablePrivilegesMapper {
    int insert(TablePrivileges record);

    int insertSelective(TablePrivileges record);
}