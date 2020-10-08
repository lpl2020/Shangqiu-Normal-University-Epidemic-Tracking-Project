package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.XUserSummary;

public interface XUserSummaryMapper {
    int insert(XUserSummary record);

    int insertSelective(XUserSummary record);
}