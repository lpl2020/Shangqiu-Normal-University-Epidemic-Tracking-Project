package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.InnodbSysTablestats;

public interface InnodbSysTablestatsMapper {
    int insert(InnodbSysTablestats record);

    int insertSelective(InnodbSysTablestats record);
}