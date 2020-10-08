package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.EventsTransactionsCurrent;

public interface EventsTransactionsCurrentMapper {
    int insert(EventsTransactionsCurrent record);

    int insertSelective(EventsTransactionsCurrent record);
}