package com.order.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.order.entity.OrderProducerEntity;

public interface OrderProduceRepository extends JpaRepository<OrderProducerEntity,Integer>{

}
