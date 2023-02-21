package com.cafeApp.coffeineOrder.application.service;

import com.cafeApp.coffeineOrder.application.port.out.CaffeineInPort;
import org.springframework.stereotype.Service;

import com.cafeApp.coffeineOrder.adapter.in.CaffeineOrderResponse;
import com.cafeApp.coffeineOrder.application.port.in.CaffeineOrderUserCase;

import java.util.List;

@Service
public class CaffeineOrderService implements CaffeineOrderUserCase {
	private final CaffeineInPort caffeineInPort;

	public CaffeineOrderService(final CaffeineInPort caffeineInPort) {
		this.caffeineInPort = caffeineInPort;
	}

	@Override
	public List<CaffeineOrderResponse> listBy() {
		return null;
	}
}
