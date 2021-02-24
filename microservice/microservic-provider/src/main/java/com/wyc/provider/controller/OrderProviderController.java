package com.wyc.provider.controller;

import com.wyc.provider.entity.OrderEntity;
import com.wyc.provider.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/provider/order")
public class OrderProviderController {

    @Resource
    private OrderService orderService;

    @GetMapping("/get/{id}")
    public OrderEntity getOrder(@PathVariable Integer id) {
        return orderService.findById(id);
    }

    @GetMapping("/get/list")
    public List<OrderEntity> getAll() {
        return orderService.findAll();
    }
}
