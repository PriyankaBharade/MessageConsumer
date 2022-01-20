package com.order.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.modelmapper.ModelMapper;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.QueueInformation;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.order.ConsumeConfig;
import com.order.dto.OrderProducer;
import com.order.dto.FulfillmentOrder;
import com.order.entity.FulfillmentOrderEntity;
import com.order.entity.OrderProducerEntity;
import com.order.repo.FulfillOrderRepo;
import com.order.repo.OrderProduceRepository;

@Service
public class OrderConsumeServiceImpl implements OrderConsumeService {
	@Autowired
	OrderProduceRepository orderProduceRepository;
	@Autowired
	FulfillOrderRepo fullfillordereRepo;
	@Autowired
	ModelMapper modelMapper;
	@Autowired
	RabbitAdmin rabbitAdmin;
	@Autowired
	AmqpTemplate amqpTemplate;
	@Autowired
	AmqpTemplate xmlAmqpTemplate;


	@Override
	public OrderProducer produceMessageOrder() {
		OrderProducer orderProducer = null;
		Properties properties = rabbitAdmin.getQueueProperties(ConsumeConfig.JSON_QUEUE);
		int reqCount = (Integer) (properties != null ? properties.get(RabbitAdmin.QUEUE_MESSAGE_COUNT) : 0);
		for (int i = 0; i < reqCount; i++) {
			try {
				byte[] bytes = (byte[]) amqpTemplate.receiveAndConvert(ConsumeConfig.JSON_QUEUE);  
				String s = new String(bytes); 
				orderProducer = new  JsonMapper().readValue(bytes, OrderProducer.class);
				OrderProducerEntity orderProducerEntity = modelMapper.map(orderProducer, OrderProducerEntity.class);
				orderProduceRepository.save(orderProducerEntity);
			}catch (Exception e) {
				System.out.println("Exception " + e.getMessage());
			}
		}
		return orderProducer;
	}


	@Override
	public OrderProducer produceMessageOrderXML(OrderProducer orderProducer) {
		System.out.println("Request Data" + orderProducer);
		OrderProducerEntity orderProducerEntity = modelMapper.map(orderProducer, OrderProducerEntity.class);
		orderProduceRepository.save(orderProducerEntity);
		return orderProducer;
	}

	@Override
	public List<FulfillmentOrder> getXmlConsume() {
		List<FulfillmentOrder> fullfilOrderList = new ArrayList<>();
		Properties properties = rabbitAdmin.getQueueProperties(ConsumeConfig.XML_QUEUE);
		int reqCount = (Integer) (properties != null ? properties.get(RabbitAdmin.QUEUE_MESSAGE_COUNT) : 0);
		System.out.println("Message Queue is... $" + properties + " " + reqCount);
		for (int i = 0; i < reqCount; i++) {
			try {
				byte[] bytes = (byte[]) amqpTemplate.receiveAndConvert(ConsumeConfig.XML_QUEUE);  
				FulfillmentOrder fulfillmentorder = new XmlMapper().readValue(bytes, FulfillmentOrder.class);
				FulfillmentOrderEntity fullfillorederentity = modelMapper.map(fulfillmentorder,FulfillmentOrderEntity.class);
				fullfillordereRepo.save(fullfillorederentity);
			} catch (Exception e) {
				System.out.println("Exception " + e.getMessage());
			}
		}
		return null;
	}

//	@Overridepublic
//	ResponseEntity<List<FulfillmentOrder>> getXmlMessage() {
//		List<FulfillmentOrder> fulfillmentOrderList = new ArrayList<>();
//		Properties properties = rabbitAdmin.getQueueProperties(AMQPConstants.XML_QUEUE);
//		int reqCount = (Integer) (properties != null ? properties.get(RabbitAdmin.QUEUE_MESSAGE_COUNT) : 0);
//		for (int i = 0; i < reqCount; i++) {
//			try {
//				FulfillmentOrder fulfillmentOrder = new XmlMapper()
//						.readValue(new String((byte[]) xmlAmqpTemplate.receiveAndConvert()), FulfillmentOrder.class);
//				FulfillmentOrderEntity entity = EntityPojoConverterUtil.xmlPojoToEntity(modelMapper, fulfillmentOrder);
//				FulfillmentOrderEntity affectedEntity = null;
//				try {
//					affectedEntity = xmlMessageRepository.save(entity);
//					fulfillmentOrderList.add(fulfillmentOrder);
//				} catch (IllegalStateException e) {
//					e.printStackTrace();
//				} finally {
//					if (affectedEntity == null) {
//						throw new ErrorSavingDataToDatabaseException();
//					}
//				}
//			} catch (Exception e) {
//				break;
//			}
//		}
//		return new ResponseEntity<>(fulfillmentOrderList, HttpStatus.OK);
//	}

}
