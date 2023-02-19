package com.cafeApp.coffeineOrder.adapter.out;

import org.springframework.stereotype.Component;

import com.cafeApp.coffeineOrder.application.port.out.CaffeineInPort;
import com.cafeApp.coffeineOrder.domain.CaffeineOrder;

@Component
public class CaffeineOrderAdapter implements CaffeineInPort{

	@Override
	public CaffeineOrder intoCaffeine() {
		return null;
	}
}
