package com.cafeApp.coffeineOrder.adapter.in;

import com.cafeApp.coffeineOrder.application.port.in.CaffeineOrderUserCase;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CaffeineController {
    private final CaffeineOrderUserCase caffeineOrderUserCase;

    public CaffeineController(final CaffeineOrderUserCase caffeineOrderUserCase) {
        this.caffeineOrderUserCase = caffeineOrderUserCase;
    }

    @GetMapping("/order")
    public List<CaffeineOrderResponse> orderCaffeine() {
        final List<CaffeineOrderResponse> response = caffeineOrderUserCase.listBy();
        return response;
    }
}
