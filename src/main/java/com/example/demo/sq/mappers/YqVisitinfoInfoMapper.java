package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.YqVisitinfoInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface YqVisitinfoInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int postSavevisitorinfo(YqVisitinfoInfo record);

    int insertSelective(YqVisitinfoInfo record);

    YqVisitinfoInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YqVisitinfoInfo record);

    int updateByPrimaryKey(YqVisitinfoInfo record);
}