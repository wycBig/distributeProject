package com.wyc.provider.serviceImpl;

import com.wyc.provider.service.OrderService;
import com.wyc.provider.entity.OrderEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class OrderServiceImpl implements OrderService {

//    private final OrderRepository orderRepository;
//
//    public OrderServiceImpl(OrderRepository orderRepository) {
//        this.orderRepository = orderRepository;
//    }

    @Override
    public OrderEntity findById(int id) {
        /*Optional<OrderEntity> byId = orderRepository.findById(id);
        return byId.get();*/
        return null;
    }

    @Override
    public List<OrderEntity> findAll() {
        /*List<OrderEntity> all = orderRepository.findAll();
        return all;*/
        return null;
    }
}
