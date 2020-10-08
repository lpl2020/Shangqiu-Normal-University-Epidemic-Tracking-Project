package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.EventsTransactionsHistory;

public interface EventsTransactionsHistoryMapper {
    int insert(EventsTransactionsHistory record);

    int insertSelective(EventsTransactionsHistory record);
}