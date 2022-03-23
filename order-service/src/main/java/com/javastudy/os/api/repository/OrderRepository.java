package com.javastudy.os.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javastudy.os.api.entity.Order;

public interface OrderRepository extends JpaRepository<Order,Integer> {
}
