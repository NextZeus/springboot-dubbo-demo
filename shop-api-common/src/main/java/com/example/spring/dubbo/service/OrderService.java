package com.example.spring.dubbo.service;

import com.example.spring.dubbo.bean.UserAddress;

import java.util.List;

public interface OrderService {
    public List<UserAddress> initOrder(String userId);
}
