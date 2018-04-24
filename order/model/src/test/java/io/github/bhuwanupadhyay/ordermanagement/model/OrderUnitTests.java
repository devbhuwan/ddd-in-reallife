package io.github.bhuwanupadhyay.ordermanagement.model;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OrderUnitTests {

    @Test
    void ignoreNullable() {
        Order order = new Order();
        order.add(null, null);
        assertEquals(0, order.totalOrderLine());
    }

    @Test
    void orderLinesAndChargeLinesHaveAlwaysEqualSize() {
        Order order = new Order();
        order.add(new OrderLine(), BigDecimal.valueOf(100));
        assertEquals(order.totalOrderLine(), order.totalChargeLine());
    }
}