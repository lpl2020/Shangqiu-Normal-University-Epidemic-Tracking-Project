package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.InnodbFtIndexTable;

public interface InnodbFtIndexTableMapper {
    int insert(InnodbFtIndexTable record);

    int insertSelective(InnodbFtIndexTable record);
}