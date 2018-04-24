package io.github.bhuwanupadhyay.ordermanagement.model;

import io.github.bhuwanupadhyay.onlinerdersystem.kernel.OrderId;
import io.github.bhuwanupadhyay.onlinerdersystem.kernel.UserId;

import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Stream;

public class Order {

    private OrderId id;
    private UserId orderBy;
    private Set<OrderLine> orderLines = new LinkedHashSet<>();
    private Set<ChargeLine> chargeLines = new LinkedHashSet<>();

    /**
     * @param line  {@code null}
     * @param price {@code null}
     */
    void add(@Nullable OrderLine line, BigDecimal price) {
        if (Stream.of(line, price).allMatch(Objects::nonNull)) {
            orderLines.add(line);
            chargeLines.add(new ChargeLine(price));
        }
    }

    int totalOrderLine() {
        return orderLines.size();
    }

    int totalChargeLine() {
        return chargeLines.size();
    }
}
