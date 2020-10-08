package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.CharacterSets;

public interface CharacterSetsMapper {
    int insert(CharacterSets record);

    int insertSelective(CharacterSets record);
}