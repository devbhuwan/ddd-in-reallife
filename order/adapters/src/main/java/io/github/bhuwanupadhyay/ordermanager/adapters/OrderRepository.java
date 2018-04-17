package io.github.bhuwanupadhyay.ordermanager.adapters;

import io.github.bhuwanupadhyay.onlinerdersystem.kernel.OrderId;
import io.github.bhuwanupadhyay.ordermanagement.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, OrderId> {
}
