package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.YqFxhealthCollection;
import com.example.demo.sq.entity.YqStudentInfo;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface YqFxhealthCollectionMapper {
//    int deleteByPrimaryKey(Integer id);
//
//    int insert(YqFxhealthCollection record);
//
//    int insertSelective(YqFxhealthCollection record);
//
//    YqFxhealthCollection selectByPrimaryKey(Integer id);
//
//    int updateByPrimaryKeySelective(YqFxhealthCollection record);
//
//    int updateByPrimaryKey(YqFxhealthCollection record);
    @Select("select * from yq_fxhealth_collection where id=#{id}")
    public YqFxhealthCollection getId(Integer id);

}