package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.Threads;

public interface ThreadsMapper {
    int insert(Threads record);

    int insertSelective(Threads record);
}