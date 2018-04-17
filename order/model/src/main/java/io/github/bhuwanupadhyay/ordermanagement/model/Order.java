package io.github.bhuwanupadhyay.ordermanagement.model;

import io.github.bhuwanupadhyay.onlinerdersystem.kernel.OrderId;
import io.github.bhuwanupadhyay.onlinerdersystem.kernel.UserId;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Order {

    private OrderId id;
    private UserId orderBy;
    private Set<OrderLine> orderLines = new LinkedHashSet<>();
    private Set<ChargeLine> chargeLines = new LinkedHashSet<>();

    public void addNewOrderLine(@Nullable OrderLine line) {
        Optional.ofNullable(line)
                .ifPresentOrElse(orderLines::add, () -> {

                });
    }

}
