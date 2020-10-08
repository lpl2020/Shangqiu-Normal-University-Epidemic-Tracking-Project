package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.SessionStatus;

public interface SessionStatusMapper {
    int insert(SessionStatus record);

    int insertSelective(SessionStatus record);
}