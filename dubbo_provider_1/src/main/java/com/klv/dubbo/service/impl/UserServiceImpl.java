package com.klv.dubbo.service.impl;

import com.klv.dubbo.bean.Address;
import com.klv.dubbo.service.UserService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    public Address getAdress() {
        return new Address("中国","南昌","南京路");
    }
}
