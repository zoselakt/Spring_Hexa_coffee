package com.cafeApp.coffeineOrder.adapter.in;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CaffeineOrderResponse {
	private long OrderNo;
	private String OrderName;
	private Timestamp OrderDate;
}
