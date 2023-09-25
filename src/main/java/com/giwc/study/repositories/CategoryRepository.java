package com.giwc.study.repositories;

import com.giwc.study.entities.Category;
import com.giwc.study.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
