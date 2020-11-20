package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.YqFxdataCollection;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Map;

@Repository
public interface YqFxdataCollectionMapper {
    int deleteByPrimaryKey(Integer id);

    void postYqFxbdinfo(YqFxdataCollection record);

    int insertSelective(YqFxdataCollection record);

    List<Map<String,Object>> getschoolInfo();

    List<YqFxdataCollection> jtSubmit(String school, String no);

    List<Map<String,Object>> getFxdataInfo(String school,String province);

    List<Map<String,Object>> getYqIbodyInfo(@Param("school") String school);

    List<Map<String,Object>> getRmlyInfo(String school);

    List<Map<String,String>> getYqFxTrafficInfo(String school);

    List<Map<String,Object>> getYqFxrylyInfo(String school);

    List<Map<String,Object>> getYqEveryYuanFxdataInfo(String school);

    YqFxdataCollection selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YqFxdataCollection record);

    int updateByPrimaryKey(YqFxdataCollection record);


    List<Map<String, Object>> getEntiCountDataInfo(String school);
    List<Map<String, Object>> getPersionDataInfo(String school,String userNo);

}