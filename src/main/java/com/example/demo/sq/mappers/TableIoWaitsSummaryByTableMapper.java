package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.TableIoWaitsSummaryByTable;

public interface TableIoWaitsSummaryByTableMapper {
    int insert(TableIoWaitsSummaryByTable record);

    int insertSelective(TableIoWaitsSummaryByTable record);
}