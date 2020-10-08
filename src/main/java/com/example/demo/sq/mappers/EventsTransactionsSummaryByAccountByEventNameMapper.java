package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.EventsTransactionsSummaryByAccountByEventName;

public interface EventsTransactionsSummaryByAccountByEventNameMapper {
    int insert(EventsTransactionsSummaryByAccountByEventName record);

    int insertSelective(EventsTransactionsSummaryByAccountByEventName record);
}