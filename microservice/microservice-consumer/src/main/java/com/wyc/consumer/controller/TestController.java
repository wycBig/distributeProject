package com.wyc.consumer.controller;


import com.wyc.consumer.service.OrderServiceConsumer;
import com.wyc.provider.RequestDTO.RequestOrderDTO;
import com.wyc.provider.entity.OrderEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("test")
public class TestController {

    @Resource
    private OrderServiceConsumer orderServiceConsumer;

    @GetMapping("get/list")
    public List<OrderEntity> getOrders(@RequestBody RequestOrderDTO requestOrderDTO) {
        return orderServiceConsumer.findAll();
    }
}
