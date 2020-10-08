package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.InnodbSysForeignCols;

public interface InnodbSysForeignColsMapper {
    int insert(InnodbSysForeignCols record);

    int insertSelective(InnodbSysForeignCols record);
}