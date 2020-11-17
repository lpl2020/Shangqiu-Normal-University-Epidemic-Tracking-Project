package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.YqSchoolConfigure;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface YqSchoolConfigureMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YqSchoolConfigure record);

    int insertSelective(YqSchoolConfigure record);

    List<Map<String,String>> getSchoolInfo(String school);

    YqSchoolConfigure selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YqSchoolConfigure record);

    int updateByPrimaryKey(YqSchoolConfigure record);
}