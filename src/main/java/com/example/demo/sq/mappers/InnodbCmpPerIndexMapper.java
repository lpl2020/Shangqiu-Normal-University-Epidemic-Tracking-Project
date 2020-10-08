package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.InnodbCmpPerIndex;

public interface InnodbCmpPerIndexMapper {
    int insert(InnodbCmpPerIndex record);

    int insertSelective(InnodbCmpPerIndex record);
}