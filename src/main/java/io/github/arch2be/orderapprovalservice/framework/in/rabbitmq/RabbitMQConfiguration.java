package io.github.arch2be.orderapprovalservice.framework.in.rabbitmq;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
class RabbitMQConfiguration {
    private final CachingConnectionFactory connectionFactory;

    @Value("${new-orders-queue}")
    private String topicName;

    RabbitMQConfiguration(final CachingConnectionFactory connectionFactory) {
        this.connectionFactory = connectionFactory;
    }

    @Bean
    Queue newOrderEventQueue() {
        return new Queue(topicName, false);
    }

    @Bean
    TopicExchange exchange() {
        return new TopicExchange(topicName + "-exchange");
    }

    @Bean
    Binding newOrderBinding(Queue orderEventQueue, TopicExchange exchange) {
        return BindingBuilder.bind(orderEventQueue).to(exchange).with("order");
    }

    @Bean
    Jackson2JsonMessageConverter converter() {
        return new Jackson2JsonMessageConverter();
    }

    @Bean
    RabbitTemplate rabbitTemplate(Jackson2JsonMessageConverter converter) {
        RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
        rabbitTemplate.setMessageConverter(converter);
        return rabbitTemplate;
    }
}
