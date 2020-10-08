package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.StatusByThread;

public interface StatusByThreadMapper {
    int insert(StatusByThread record);

    int insertSelective(StatusByThread record);
}