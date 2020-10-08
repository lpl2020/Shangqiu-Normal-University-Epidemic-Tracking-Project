package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.FileSummaryByInstance;

public interface FileSummaryByInstanceMapper {
    int insert(FileSummaryByInstance record);

    int insertSelective(FileSummaryByInstance record);
}