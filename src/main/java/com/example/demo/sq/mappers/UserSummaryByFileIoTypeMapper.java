package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.UserSummaryByFileIoTypeWithBLOBs;

public interface UserSummaryByFileIoTypeMapper {
    int insert(UserSummaryByFileIoTypeWithBLOBs record);

    int insertSelective(UserSummaryByFileIoTypeWithBLOBs record);
}