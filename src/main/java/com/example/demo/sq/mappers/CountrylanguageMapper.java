package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.Countrylanguage;
import com.example.demo.sq.entity.CountrylanguageKey;

public interface CountrylanguageMapper {
    int deleteByPrimaryKey(CountrylanguageKey key);

    int insert(Countrylanguage record);

    int insertSelective(Countrylanguage record);

    Countrylanguage selectByPrimaryKey(CountrylanguageKey key);

    int updateByPrimaryKeySelective(Countrylanguage record);

    int updateByPrimaryKey(Countrylanguage record);
}