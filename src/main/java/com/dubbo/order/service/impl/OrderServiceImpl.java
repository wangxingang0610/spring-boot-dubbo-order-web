package com.dubbo.order.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.bean.UserAddress;
import com.dubbo.service.OrderService;
import com.dubbo.service.UserService;

@Service
public class OrderServiceImpl implements OrderService {

	//远程引用服务@Reference
	@Reference
	UserService userService;
	
	public List<UserAddress> initOrder(String userId) {
		
		//1、查询用户的收货ַ
		List<UserAddress> addressList = userService.getUserAddressList(userId);
		for (UserAddress userAddress : addressList) {
			System.out.println(userAddress.getUserAddress());
		}
		return addressList;
	}

}
