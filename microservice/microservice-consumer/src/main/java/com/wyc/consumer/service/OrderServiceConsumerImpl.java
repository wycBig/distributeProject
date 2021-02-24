package com.wyc.consumer.service;

import com.wyc.provider.entity.OrderEntity;
import com.wyc.provider.service.OrderService;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Service
public class OrderServiceConsumerImpl implements OrderServiceConsumer{

    @Reference(check = false)
    private OrderService orderService;

    @Override
    public List<OrderEntity> findAll() {
        return orderService.findAll();
    }
}
