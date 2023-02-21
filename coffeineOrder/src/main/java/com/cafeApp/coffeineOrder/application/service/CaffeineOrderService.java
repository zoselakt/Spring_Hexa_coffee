package com.cafeApp.coffeineOrder.application.service;

import com.cafeApp.coffeineOrder.application.port.out.CaffeineInPort;
import com.cafeApp.coffeineOrder.domain.CaffeineOrder;
import org.springframework.stereotype.Service;

import com.cafeApp.coffeineOrder.adapter.in.CaffeineOrderResponse;
import com.cafeApp.coffeineOrder.application.port.in.CaffeineOrderUserCase;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CaffeineOrderService implements CaffeineOrderUserCase {
    private final CaffeineInPort caffeineInPort;

    public CaffeineOrderService(final CaffeineInPort caffeineInPort) {
        this.caffeineInPort = caffeineInPort;
    }

    @Override
    public List<CaffeineOrderResponse> listBy() {
        final List<CaffeineOrder> orders = caffeineInPort.listBy();
        return orders.stream()
                .map(this::mapToResponse)
                .collect(Collectors.toList());
    }

    private CaffeineOrderResponse mapToResponse(final CaffeineOrder caffeineOrder) {
        return new CaffeineOrderResponse(
                caffeineOrder.getOrderNo(),
                caffeineOrder.getOrderUser(),
                caffeineOrder.getOrderDate());
    }
}
