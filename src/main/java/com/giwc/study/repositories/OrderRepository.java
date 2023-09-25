package com.giwc.study.repositories;

import com.giwc.study.entities.Order;
import com.giwc.study.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
