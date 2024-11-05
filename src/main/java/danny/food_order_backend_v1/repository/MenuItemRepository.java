package danny.food_order_backend_v1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import danny.food_order_backend_v1.entity.MenuItem;

public interface MenuItemRepository extends JpaRepository<MenuItem, Long> { }
