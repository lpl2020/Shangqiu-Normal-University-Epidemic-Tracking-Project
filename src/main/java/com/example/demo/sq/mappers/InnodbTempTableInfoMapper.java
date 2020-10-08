package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.InnodbTempTableInfo;

public interface InnodbTempTableInfoMapper {
    int insert(InnodbTempTableInfo record);

    int insertSelective(InnodbTempTableInfo record);
}