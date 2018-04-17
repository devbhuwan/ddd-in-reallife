package io.github.bhuwanupadhyay.ordermanagement.model;

import org.junit.jupiter.api.Test;

class OrderUnitTests {

    @Test
    void name() {
        Order order = new Order();
        order.addNewOrderLine(new OrderLine());
    }
}