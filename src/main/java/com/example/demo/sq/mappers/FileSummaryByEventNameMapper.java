package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.FileSummaryByEventName;

public interface FileSummaryByEventNameMapper {
    int insert(FileSummaryByEventName record);

    int insertSelective(FileSummaryByEventName record);
}