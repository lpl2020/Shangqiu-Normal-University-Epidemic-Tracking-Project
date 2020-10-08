package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.CollationCharacterSetApplicability;

public interface CollationCharacterSetApplicabilityMapper {
    int insert(CollationCharacterSetApplicability record);

    int insertSelective(CollationCharacterSetApplicability record);
}