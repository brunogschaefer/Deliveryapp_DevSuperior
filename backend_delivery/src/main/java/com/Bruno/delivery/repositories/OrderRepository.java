package com.Bruno.delivery.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Bruno.delivery.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
