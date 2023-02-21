package com.cafeApp.coffeineOrder.application.port.in;

import com.cafeApp.coffeineOrder.adapter.in.CaffeineOrderResponse;

import java.util.List;

public interface CaffeineOrderUserCase {
	List<CaffeineOrderResponse> listBy();
}
