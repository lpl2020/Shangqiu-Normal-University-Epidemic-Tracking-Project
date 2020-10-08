package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.UserVariablesByThread;

public interface UserVariablesByThreadMapper {
    int insert(UserVariablesByThread record);

    int insertSelective(UserVariablesByThread record);
}