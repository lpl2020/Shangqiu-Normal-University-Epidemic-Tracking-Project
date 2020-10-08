package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.SessionSslStatus;

public interface SessionSslStatusMapper {
    int insert(SessionSslStatus record);

    int insertSelective(SessionSslStatus record);
}