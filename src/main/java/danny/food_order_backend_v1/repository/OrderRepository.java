package danny.food_order_backend_v1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import danny.food_order_backend_v1.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> { }
