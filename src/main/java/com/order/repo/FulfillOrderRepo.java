package com.order.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.order.entity.FulfillmentOrderEntity;


public interface FulfillOrderRepo extends JpaRepository<FulfillmentOrderEntity,Integer>{

}
