package org.hillel.homework_34.repo;

import org.hillel.homework_34.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
