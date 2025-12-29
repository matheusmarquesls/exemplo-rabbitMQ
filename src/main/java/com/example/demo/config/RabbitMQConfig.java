package com.example.demo.config;


import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class RabbitMQConfig {
    public static final String NOTICICACAO_QUEUE = "notificacao.queue";
    @Bean
    public Queue notificacoesQueue(){
        return new Queue(NOTICICACAO_QUEUE,false);

    }
}
