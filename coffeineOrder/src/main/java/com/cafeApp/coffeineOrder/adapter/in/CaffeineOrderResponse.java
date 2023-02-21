package com.cafeApp.coffeineOrder.adapter.in;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CaffeineOrderResponse {
	private Long OrderNo;
	private String OrderName;
	private LocalDateTime OrderDate;
}