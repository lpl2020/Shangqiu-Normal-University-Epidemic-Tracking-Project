package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.UserSummaryByStagesWithBLOBs;

public interface UserSummaryByStagesMapper {
    int insert(UserSummaryByStagesWithBLOBs record);

    int insertSelective(UserSummaryByStagesWithBLOBs record);
}