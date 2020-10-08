package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.XIoByThreadByLatency;

public interface XIoByThreadByLatencyMapper {
    int insert(XIoByThreadByLatency record);

    int insertSelective(XIoByThreadByLatency record);
}