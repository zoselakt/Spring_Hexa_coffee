package com.cafeApp.coffeineOrder.application.port.in;

import com.cafeApp.coffeineOrder.adapter.in.CaffeineOrderResponse;

public interface CaffeineOrderUserCase {
	CaffeineOrderResponse intoOrder();
}
