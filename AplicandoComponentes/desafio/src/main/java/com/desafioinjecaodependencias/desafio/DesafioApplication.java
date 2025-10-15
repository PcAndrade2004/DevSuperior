package com.desafioinjecaodependencias.desafio;

import com.desafioinjecaodependencias.desafio.entity.Order;
import com.desafioinjecaodependencias.desafio.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafioApplication implements CommandLineRunner {

    @Autowired
    private OrderService orderService;

    @Override
    public void run(String... args) throws Exception {
        Order order = new Order(8742, 150.00, 20.0);
        double total = orderService.total(order);
        System.out.printf("Pedido código %d%nValor total: R$ %.2f%n", order.getCode(), total);
    }

    public static void main(String[] args) {
        SpringApplication.run(DesafioApplication.class, args);
    }
}