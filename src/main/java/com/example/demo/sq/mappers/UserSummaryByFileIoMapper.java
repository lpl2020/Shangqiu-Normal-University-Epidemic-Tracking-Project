package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.UserSummaryByFileIo;

public interface UserSummaryByFileIoMapper {
    int insert(UserSummaryByFileIo record);

    int insertSelective(UserSummaryByFileIo record);
}