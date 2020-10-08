package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.InnodbBufferPageLru;

public interface InnodbBufferPageLruMapper {
    int insert(InnodbBufferPageLru record);

    int insertSelective(InnodbBufferPageLru record);
}