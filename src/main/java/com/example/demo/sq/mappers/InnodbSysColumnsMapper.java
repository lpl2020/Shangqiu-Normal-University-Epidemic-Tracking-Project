package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.InnodbSysColumns;

public interface InnodbSysColumnsMapper {
    int insert(InnodbSysColumns record);

    int insertSelective(InnodbSysColumns record);
}