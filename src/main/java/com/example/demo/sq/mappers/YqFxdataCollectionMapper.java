package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.YqFxdataCollection;
import com.example.demo.sq.entity.YqStudentInfo;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Map;

@Repository
public interface YqFxdataCollectionMapper {
    int deleteByPrimaryKey(Integer id);

    void postYqFxbdinfo(YqFxdataCollection record);

    int insertSelective(YqFxdataCollection record);

    List<Map<String,Object>> getFxdataInfo(String school);

    List<Map<String,Object>> getYqIbodyInfo(String school);

    List<Map<String,Object>> getRmlyInfo(String school);

    List<Map<String,String>> getYqFxTrafficInfo(String school);

    List<Map<String,Object>> getYqFxrylyInfo(String school);

    List<Map<String,Object>> getYqEveryYuanFxdataInfo(String school);

    YqFxdataCollection selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YqFxdataCollection record);

    int updateByPrimaryKey(YqFxdataCollection record);
}