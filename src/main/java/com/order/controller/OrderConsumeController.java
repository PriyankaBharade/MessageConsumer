package com.order.controller;

import java.util.List;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.order.dto.OrderProducer;
import com.order.dto.FulfillmentOrder;
import com.order.services.OrderConsumeService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("order/consumer")
public class OrderConsumeController {

	@Autowired
	private RabbitTemplate template;
	@Autowired
	OrderConsumeService orderConsumeService;
	@Autowired
	RabbitAdmin rabbitAdmin;
	@Autowired
	AmqpTemplate amqpTemplate;

//	@PostMapping(value = "/save/order", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
//	ResponseEntity<OrderProducer> getOrder(@RequestBody OrderProducer orderProducer) {
//		//template.convertAndSend(MQProducer.EXCHNAGE, MQProducer.RoutingKey,orderProducer);
//		return new ResponseEntity<>(orderProduceService.produceMessageOrder(orderProducer), HttpStatus.OK);
//	}

	@ApiOperation(value = "Consume JSON data from the RabbitMQ server.")
	@GetMapping(value = "/save/order")
	ResponseEntity<OrderProducer> getOrder() {
		return new ResponseEntity<>(orderConsumeService.produceMessageOrder(), HttpStatus.OK);
	}

//	@PostMapping(value = "/create/xml/order", consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
//	ResponseEntity<OrderProducer> addXMLOrder(@RequestBody OrderProducer orderProducer) {
//		return new ResponseEntity<>(orderProduceService.produceMessageOrder(orderProducer), HttpStatus.OK);
//	}

	@ApiOperation(value = "Consume XML data from the RabbitMQ server.")
	@GetMapping(value = "/get/xml/order", consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
	// , consumes = MediaType.APPLICATION_XML_VALUE, produces =//
	// MediaType.APPLICATION_XML_VALUE
	List<FulfillmentOrder> getXmlConsume() {
		// System.out.println("FulFillData" + fulfillmentOrder.toString());
		return orderConsumeService.getXmlConsume();
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
