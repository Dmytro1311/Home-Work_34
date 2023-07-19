package org.hillel.homework_34.repo;

import org.hillel.homework_34.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Integer> {
}
