package io.github.bhuwanupadhyay.ordermanagement.model;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

class OrderLine {

    private OrderLineId id;
    private List<Item> items = new LinkedList<>();
    private ChargeAmount chargeAmount;

}
