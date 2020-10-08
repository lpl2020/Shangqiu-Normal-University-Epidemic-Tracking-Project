package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.InnodbSysFields;

public interface InnodbSysFieldsMapper {
    int insert(InnodbSysFields record);

    int insertSelective(InnodbSysFields record);
}