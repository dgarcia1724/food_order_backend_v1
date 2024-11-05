package danny.food_order_backend_v1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import danny.food_order_backend_v1.entity.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> { }