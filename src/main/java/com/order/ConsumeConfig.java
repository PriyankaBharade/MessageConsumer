package com.order;
import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.Jackson2XmlMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConsumeConfig {
	public static final String JSON_QUEUE = "Message_queue";
	public static final String XML_QUEUE = "XML_queue";
	public static final String EXCHNAGE = "Message_queue";
	public static final String RoutingKey = "meassge_routingKey";
	
	@Bean
	Queue jsonQueue() {
	return new Queue(JSON_QUEUE, true);
	}

	@Bean
	Queue xmlQueue() {
	return new Queue(XML_QUEUE, true);
	}

	@Bean
	DirectExchange exchange() {
	return new DirectExchange(EXCHNAGE);
	}

	@Bean
	Binding binding1(DirectExchange exchange) {
	return BindingBuilder.bind(jsonQueue()).to(exchange).with(jsonQueue().getName());
	}

	@Bean
	Binding binding2(DirectExchange exchange) {
	return BindingBuilder.bind(xmlQueue()).to(exchange).with(xmlQueue().getName());
	}

//	@Bean
//	public AmqpTemplate jsonAmqpTemplate(ConnectionFactory connectionFactory) {
//	final RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
//	rabbitTemplate.setRoutingKey(RoutingKey);
//	rabbitTemplate.setMessageConverter(new Jackson2XmlMessageConverter());
//	rabbitTemplate.setDefaultReceiveQueue(jsonQueue().getName());
//	return rabbitTemplate;
//	}
//
//	@Bean
//	public AmqpTemplate xmlAmqpTemplate(ConnectionFactory connectionFactory) {
//	final RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
//	rabbitTemplate.setRoutingKey(RoutingKey);
//	rabbitTemplate.setMessageConverter(new Jackson2JsonMessageConverter());
//	rabbitTemplate.setDefaultReceiveQueue(xmlQueue().getName());
//	return rabbitTemplate;
//	}
	
	@Bean
	public RabbitAdmin rabbitAdmin(ConnectionFactory connectionFactory) {
		return new RabbitAdmin(connectionFactory);
	}
}
