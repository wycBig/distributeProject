package com.wyc.consumer.service;

import com.wyc.provider.entity.OrderEntity;

import java.util.List;

public interface OrderServiceConsumer{
    List<OrderEntity> findAll();
}
