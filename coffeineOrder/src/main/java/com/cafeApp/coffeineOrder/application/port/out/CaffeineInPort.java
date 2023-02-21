package com.cafeApp.coffeineOrder.application.port.out;

import com.cafeApp.coffeineOrder.domain.CaffeineOrder;

import java.util.List;

public interface CaffeineInPort {
	List<CaffeineOrder> listBy();
}
