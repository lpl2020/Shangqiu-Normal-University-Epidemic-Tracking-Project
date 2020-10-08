package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.InnodbSysTables;

public interface InnodbSysTablesMapper {
    int insert(InnodbSysTables record);

    int insertSelective(InnodbSysTables record);
}