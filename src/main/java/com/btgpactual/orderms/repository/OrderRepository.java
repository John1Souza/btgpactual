package com.btgpactual.orderms.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.btgpactual.orderms.entity.OrderEntity;

public interface OrderRepository extends MongoRepository<OrderEntity, Long> {

}