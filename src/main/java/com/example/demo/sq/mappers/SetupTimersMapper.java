package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.SetupTimers;

public interface SetupTimersMapper {
    int insert(SetupTimers record);

    int insertSelective(SetupTimers record);
}