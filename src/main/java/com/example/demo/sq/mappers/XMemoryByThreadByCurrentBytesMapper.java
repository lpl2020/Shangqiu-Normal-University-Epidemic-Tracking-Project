package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.XMemoryByThreadByCurrentBytes;

public interface XMemoryByThreadByCurrentBytesMapper {
    int insert(XMemoryByThreadByCurrentBytes record);

    int insertSelective(XMemoryByThreadByCurrentBytes record);
}