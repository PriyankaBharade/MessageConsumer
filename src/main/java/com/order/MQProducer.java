//package com.order;
//
//import org.springframework.amqp.core.Queue;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.amqp.core.AmqpTemplate;
//import org.springframework.amqp.core.Binding;
//import org.springframework.amqp.core.BindingBuilder;
//import org.springframework.amqp.core.TopicExchange;
//import org.springframework.amqp.rabbit.core.RabbitAdmin;
//import org.springframework.amqp.rabbit.core.RabbitTemplate;
//import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
//import org.springframework.amqp.support.converter.MessageConverter;
//import org.springframework.amqp.rabbit.connection.ConnectionFactory;
//
//@Configuration
//public class MQProducer {
//	public static final String QUEUE = "Message_queue";
//	public static final String EXCHNAGE = "Message_queue";
//	public static final String RoutingKey = "meassge_routingKey";
//
//	@Bean
//	public Queue queue() {
//		return new Queue(QUEUE);
//	}
//
//	@Bean
//	public TopicExchange exchange() {
//		return new TopicExchange(EXCHNAGE);
//	}
//
//	@Bean
//	public Binding binding(Queue queue, TopicExchange topicExchange) {
//		return BindingBuilder.bind(queue).to(topicExchange).with(RoutingKey);
//	}
//	
//	@Bean
//	public MessageConverter messagConverter() {
//		return new Jackson2JsonMessageConverter();
//	}
//	
//	
//	@Bean
//    public RabbitTemplate rabbitTemplate(ConnectionFactory connectionFactory) {
//        final RabbitTemplate template = new RabbitTemplate(connectionFactory);
//        template.setMessageConverter(messagConverter());
//        return template;
//    }
//	
//	@Bean
//	public RabbitAdmin rabbitAdmin(ConnectionFactory connectionFactory) {
//		return new RabbitAdmin(connectionFactory);
//	}
//}
