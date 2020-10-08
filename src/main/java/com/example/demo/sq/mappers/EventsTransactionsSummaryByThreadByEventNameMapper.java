package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.EventsTransactionsSummaryByThreadByEventName;

public interface EventsTransactionsSummaryByThreadByEventNameMapper {
    int insert(EventsTransactionsSummaryByThreadByEventName record);

    int insertSelective(EventsTransactionsSummaryByThreadByEventName record);
}