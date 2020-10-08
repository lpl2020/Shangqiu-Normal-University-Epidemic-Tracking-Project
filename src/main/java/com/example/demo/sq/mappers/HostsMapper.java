package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.Hosts;

public interface HostsMapper {
    int insert(Hosts record);

    int insertSelective(Hosts record);
}