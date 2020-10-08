package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.InnodbCmp;

public interface InnodbCmpMapper {
    int insert(InnodbCmp record);

    int insertSelective(InnodbCmp record);
}