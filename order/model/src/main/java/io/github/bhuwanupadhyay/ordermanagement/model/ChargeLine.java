package io.github.bhuwanupadhyay.ordermanagement.model;

import java.math.BigDecimal;

class ChargeLine {

    private ChargeLineId id;
    private OrderLineId orderLineId;
    private BigDecimal chargeAmount;

    ChargeLine(BigDecimal amount) {
        this.chargeAmount = amount;
    }
}
