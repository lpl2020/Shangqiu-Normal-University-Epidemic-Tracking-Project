package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.InnodbCmpmem;

public interface InnodbCmpmemMapper {
    int insert(InnodbCmpmem record);

    int insertSelective(InnodbCmpmem record);
}