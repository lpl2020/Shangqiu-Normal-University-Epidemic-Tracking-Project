package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.InnodbFtConfig;

public interface InnodbFtConfigMapper {
    int insert(InnodbFtConfig record);

    int insertSelective(InnodbFtConfig record);
}