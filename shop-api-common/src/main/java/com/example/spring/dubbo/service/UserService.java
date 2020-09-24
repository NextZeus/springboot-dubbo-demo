package com.example.spring.dubbo.service;

import com.example.spring.dubbo.bean.UserAddress;

import java.util.List;

public interface UserService {
    public List<UserAddress> getUserAddressList(String userId);
}
