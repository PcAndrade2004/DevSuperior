package com.desafioinjecaodependencias.desafio.services;

import com.desafioinjecaodependencias.desafio.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public double total(Order order) {
        double discountPrice = order.getBasic() * (1 - order.getDiscount() / 100.0);
        return discountPrice + shippingService.shipment(order);
    }
}