package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.SessionWithBLOBs;

public interface SessionMapper {
    int insert(SessionWithBLOBs record);

    int insertSelective(SessionWithBLOBs record);
}