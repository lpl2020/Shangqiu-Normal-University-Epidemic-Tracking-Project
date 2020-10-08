package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.EventsTransactionsSummaryGlobalByEventName;

public interface EventsTransactionsSummaryGlobalByEventNameMapper {
    int insert(EventsTransactionsSummaryGlobalByEventName record);

    int insertSelective(EventsTransactionsSummaryGlobalByEventName record);
}