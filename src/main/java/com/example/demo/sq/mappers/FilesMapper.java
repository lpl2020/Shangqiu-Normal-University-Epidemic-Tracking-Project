package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.Files;

public interface FilesMapper {
    int insert(Files record);

    int insertSelective(Files record);
}