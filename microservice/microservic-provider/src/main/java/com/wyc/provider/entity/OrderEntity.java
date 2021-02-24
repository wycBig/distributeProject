package com.wyc.provider.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "wyc_order")
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "order_name")
    private String orderName;

    @Column(name = "order_price")
    private String orderPrice;

    @Column(name = "order_number")
    private Integer orderNumber;
}
