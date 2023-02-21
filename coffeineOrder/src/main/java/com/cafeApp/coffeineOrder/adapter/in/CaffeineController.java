package com.cafeApp.coffeineOrder.adapter.in;

import com.cafeApp.coffeineOrder.application.port.in.CaffeineOrderUserCase;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CaffeineController {

    @GetMapping("/order")
    public CaffeineOrderResponse orderCaffeine() {
        return null;
    }
}
