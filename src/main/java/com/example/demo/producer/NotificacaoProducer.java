package com.example.demo.producer;

import com.example.demo.config.RabbitMQConfig;
import com.example.demo.model.Notificacao;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
public class NotificacaoProducer {

    private final RabbitTemplate rabbitTemplate;

    public NotificacaoProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void enviar(Notificacao noficacao){
        rabbitTemplate.convertAndSend(RabbitMQConfig.NOTICICACAO_QUEUE, noficacao);
        System.out.println("Notificacao enviada com sucesso" + noficacao.getUsuario());
    }
}
