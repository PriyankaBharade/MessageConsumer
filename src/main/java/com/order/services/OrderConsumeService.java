package com.order.services;

import java.util.List;

import com.order.dto.OrderProducer;
import com.order.dto.FulfillmentOrder;

public interface OrderConsumeService {

	public OrderProducer produceMessageOrder();

	public OrderProducer produceMessageOrderXML(OrderProducer orderProducer);
	
	public List<FulfillmentOrder> getXmlConsume();
}
