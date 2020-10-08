package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.UserSummaryByStatementTypeWithBLOBs;

public interface UserSummaryByStatementTypeMapper {
    int insert(UserSummaryByStatementTypeWithBLOBs record);

    int insertSelective(UserSummaryByStatementTypeWithBLOBs record);
}