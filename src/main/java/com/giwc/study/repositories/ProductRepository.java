package com.giwc.study.repositories;

import com.giwc.study.entities.Category;
import com.giwc.study.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
