package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.UserSummaryWithBLOBs;

public interface UserSummaryMapper {
    int insert(UserSummaryWithBLOBs record);

    int insertSelective(UserSummaryWithBLOBs record);
}