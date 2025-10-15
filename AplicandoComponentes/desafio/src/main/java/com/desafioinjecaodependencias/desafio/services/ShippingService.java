package com.desafioinjecaodependencias.desafio.services;

import com.desafioinjecaodependencias.desafio.entity.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order) {
        double basic = order.getBasic();

        if (basic < 100.00) {
            return 20.00;
        } else if (basic >= 100.00 && basic < 200.00) {
            return 12.00;
        } else {
            return 0.00;
        }
    }
}