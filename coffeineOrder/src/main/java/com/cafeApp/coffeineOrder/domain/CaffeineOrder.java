package com.cafeApp.coffeineOrder.domain;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CaffeineOrder {
	private Long orderNo;
	private Long orderPrice;
	private String goodsName;
	private String orderUser;
	private LocalDateTime orderDate;
}
