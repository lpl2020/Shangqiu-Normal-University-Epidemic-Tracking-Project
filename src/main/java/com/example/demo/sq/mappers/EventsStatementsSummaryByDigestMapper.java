package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.EventsStatementsSummaryByDigest;

public interface EventsStatementsSummaryByDigestMapper {
    int insert(EventsStatementsSummaryByDigest record);

    int insertSelective(EventsStatementsSummaryByDigest record);
}