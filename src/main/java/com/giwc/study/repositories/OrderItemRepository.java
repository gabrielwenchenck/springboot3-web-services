package com.giwc.study.repositories;

import com.giwc.study.entities.OrderItem;
import com.giwc.study.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
