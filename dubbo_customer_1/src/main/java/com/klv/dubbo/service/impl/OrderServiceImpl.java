package com.klv.dubbo.service.impl;

import com.klv.dubbo.bean.Address;
import com.klv.dubbo.bean.User;
import com.klv.dubbo.service.OrderService;
import com.klv.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService{

@Autowired
    UserService userService;
    public void initOrder() {
         userService.getAdress();
    }
}
