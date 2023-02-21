package com.cafeApp.coffeineOrder.adapter.out;

import org.springframework.stereotype.Component;

import com.cafeApp.coffeineOrder.application.port.out.CaffeineInPort;
import com.cafeApp.coffeineOrder.domain.CaffeineOrder;

import java.util.List;

@Component
public class CaffeineOrderAdapter implements CaffeineInPort{

	@Override
	public List<CaffeineOrder> listBy() {
		return null;
	}
}
