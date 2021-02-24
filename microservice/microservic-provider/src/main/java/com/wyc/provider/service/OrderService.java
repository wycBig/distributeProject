package com.wyc.provider.service;


import com.wyc.provider.entity.OrderEntity;

import java.util.List;

public interface OrderService {

    OrderEntity findById(int id);

    List<OrderEntity> findAll();
}
