package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.XHostSummary;

public interface XHostSummaryMapper {
    int insert(XHostSummary record);

    int insertSelective(XHostSummary record);
}