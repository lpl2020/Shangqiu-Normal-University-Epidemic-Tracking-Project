package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.EventsTransactionsHistoryLong;

public interface EventsTransactionsHistoryLongMapper {
    int insert(EventsTransactionsHistoryLong record);

    int insertSelective(EventsTransactionsHistoryLong record);
}