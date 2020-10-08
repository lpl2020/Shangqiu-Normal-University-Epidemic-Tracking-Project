package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.InnodbTrx;

public interface InnodbTrxMapper {
    int insert(InnodbTrx record);

    int insertSelective(InnodbTrx record);
}