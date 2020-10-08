package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.InnodbSysIndexes;

public interface InnodbSysIndexesMapper {
    int insert(InnodbSysIndexes record);

    int insertSelective(InnodbSysIndexes record);
}