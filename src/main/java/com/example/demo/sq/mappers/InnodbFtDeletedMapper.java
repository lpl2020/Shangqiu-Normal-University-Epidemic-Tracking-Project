package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.InnodbFtDeleted;

public interface InnodbFtDeletedMapper {
    int insert(InnodbFtDeleted record);

    int insertSelective(InnodbFtDeleted record);
}