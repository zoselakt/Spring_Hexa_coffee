package com.cafeApp.coffeineOrder.application.service;

import org.springframework.stereotype.Service;

import com.cafeApp.coffeineOrder.adapter.in.CaffeineOrderResponse;
import com.cafeApp.coffeineOrder.application.port.in.CaffeineOrderUserCase;

@Service
public class CaffeineOrderService implements CaffeineOrderUserCase{

	@Override
	public CaffeineOrderResponse intoOrder() {
		return null;
	}
}
