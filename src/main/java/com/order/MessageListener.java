package com.order;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.order.dto.OrderProducer;
import com.order.services.OrderConsumeService;

@Component
public class MessageListener {
	@Autowired
	OrderConsumeService orderProduceService;
	
//	@RabbitListener(queues = MQProducer.QUEUE)
//	public void listener(OrderProducer orderProducer) {
//		System.out.println("Order data ...... " + orderProducer);
//		//orderProduceService.produceMessageOrder(orderProducer);
//	}
}
