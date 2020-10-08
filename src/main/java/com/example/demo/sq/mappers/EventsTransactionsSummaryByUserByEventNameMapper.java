package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.EventsTransactionsSummaryByUserByEventName;

public interface EventsTransactionsSummaryByUserByEventNameMapper {
    int insert(EventsTransactionsSummaryByUserByEventName record);

    int insertSelective(EventsTransactionsSummaryByUserByEventName record);
}