package io.github.bhuwanupadhyay.ordermanagement.model;

import java.util.LinkedList;
import java.util.List;

public class OrderLine {

    private OrderLineId id;
    private List<Item> items = new LinkedList<>();

}
