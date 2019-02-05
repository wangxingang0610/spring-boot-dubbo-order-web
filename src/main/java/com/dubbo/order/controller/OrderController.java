package com.dubbo.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dubbo.bean.UserAddress;
import com.dubbo.service.OrderService;

@Controller
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	@ResponseBody
	@RequestMapping("initOrder")
	public List<UserAddress> initOrder(@RequestParam("userId") String userId){
		
		return orderService.initOrder(userId);
	}

}
