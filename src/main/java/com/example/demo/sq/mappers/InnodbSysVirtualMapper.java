package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.InnodbSysVirtual;

public interface InnodbSysVirtualMapper {
    int insert(InnodbSysVirtual record);

    int insertSelective(InnodbSysVirtual record);
}