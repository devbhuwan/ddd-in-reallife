package io.github.bhuwanupadhyay.onlinerdersystem.kernel;

import java.time.LocalDateTime;
import java.util.Objects;

public class OrderId {

    private final String refNo;
    private final LocalDateTime dateTime;

    public OrderId(String refNo, LocalDateTime dateTime) {
        this.refNo = refNo;
        this.dateTime = dateTime;
    }

    public String getRefNo() {
        return refNo;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderId orderId = (OrderId) o;
        return Objects.equals(refNo, orderId.refNo) &&
                Objects.equals(dateTime, orderId.dateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(refNo, dateTime);
    }
}
