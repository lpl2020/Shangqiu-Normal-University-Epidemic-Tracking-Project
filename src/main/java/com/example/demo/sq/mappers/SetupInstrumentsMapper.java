package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.SetupInstruments;

public interface SetupInstrumentsMapper {
    int insert(SetupInstruments record);

    int insertSelective(SetupInstruments record);
}