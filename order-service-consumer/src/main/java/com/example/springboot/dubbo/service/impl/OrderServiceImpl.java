package com.example.springboot.dubbo.service.impl;

import com.example.spring.dubbo.bean.UserAddress;
import com.example.spring.dubbo.service.OrderService;
import com.example.spring.dubbo.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    // dubbo直连
    @Reference(loadbalance="random", timeout=1000)
    UserService userService;

    @Override
    public List<UserAddress> initOrder(String userId) {
        return userService.getUserAddressList(userId);
    }
}
