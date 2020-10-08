package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.XMemoryByUserByCurrentBytes;

public interface XMemoryByUserByCurrentBytesMapper {
    int insert(XMemoryByUserByCurrentBytes record);

    int insertSelective(XMemoryByUserByCurrentBytes record);
}