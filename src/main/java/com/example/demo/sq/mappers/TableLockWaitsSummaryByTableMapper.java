package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.TableLockWaitsSummaryByTable;

public interface TableLockWaitsSummaryByTableMapper {
    int insert(TableLockWaitsSummaryByTable record);

    int insertSelective(TableLockWaitsSummaryByTable record);
}