package com.klv.dubbo.service;

import com.klv.dubbo.bean.Address;
import org.springframework.stereotype.Service;

@Service
public class UserServiceimpl implements UserService{
    public Address getAdress() {
        return new Address("中国","南昌","南京路");
    }
}
