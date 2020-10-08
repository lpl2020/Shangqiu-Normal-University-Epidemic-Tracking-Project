package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.UserPrivileges;

public interface UserPrivilegesMapper {
    int insert(UserPrivileges record);

    int insertSelective(UserPrivileges record);
}