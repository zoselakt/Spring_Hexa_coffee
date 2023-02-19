package com.cafeApp.coffeineOrder.domain;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CaffeineOrder {
	private long orderNo;
	private long orderPrice;
	private String goodsName;
	private String orderUser;
	private Timestamp orderDate;
}
