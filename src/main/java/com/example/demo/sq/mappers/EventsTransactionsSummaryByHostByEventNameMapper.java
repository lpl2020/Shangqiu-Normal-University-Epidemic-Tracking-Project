package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.EventsTransactionsSummaryByHostByEventName;

public interface EventsTransactionsSummaryByHostByEventNameMapper {
    int insert(EventsTransactionsSummaryByHostByEventName record);

    int insertSelective(EventsTransactionsSummaryByHostByEventName record);
}