package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.Memorandum;

public interface MemorandumMapper {
    int deleteByPrimaryKey(String memoId);

    int insert(Memorandum record);

    int insertSelective(Memorandum record);

    Memorandum selectByPrimaryKey(String memoId);

    int updateByPrimaryKeySelective(Memorandum record);

    int updateByPrimaryKeyWithBLOBs(Memorandum record);

    int updateByPrimaryKey(Memorandum record);
}