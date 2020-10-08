package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.XLatestFileIo;

public interface XLatestFileIoMapper {
    int insert(XLatestFileIo record);

    int insertSelective(XLatestFileIo record);
}