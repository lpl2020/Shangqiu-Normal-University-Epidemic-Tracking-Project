package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.InnodbBufferPage;

public interface InnodbBufferPageMapper {
    int insert(InnodbBufferPage record);

    int insertSelective(InnodbBufferPage record);
}