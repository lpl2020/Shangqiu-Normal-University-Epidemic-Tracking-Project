package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.InnodbBufferPoolStats;

public interface InnodbBufferPoolStatsMapper {
    int insert(InnodbBufferPoolStats record);

    int insertSelective(InnodbBufferPoolStats record);
}