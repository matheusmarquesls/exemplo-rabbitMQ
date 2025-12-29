package com.example.demo.consumer;

import com.example.demo.config.RabbitMQConfig;
import com.example.demo.model.Notificacao;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class NotificacaoConsumer {
    @RabbitListener(queues = RabbitMQConfig.NOTICICACAO_QUEUE)
    public void consumir(Notificacao notificacao){
        System.out.println("Notificação recebida para: " + notificacao.getUsuario() + "." + notificacao.getMensagem());
    }


}
