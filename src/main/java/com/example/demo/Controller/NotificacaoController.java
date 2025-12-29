package com.example.demo.Controller;

import com.example.demo.model.Notificacao;
import com.example.demo.producer.NotificacaoProducer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notificacoes")
public class NotificacaoController {
    private final NotificacaoProducer producer;
    public NotificacaoController(NotificacaoProducer producer){
        this.producer = producer;
    }

    @PostMapping
    public String enviarNotificacao(@RequestBody Notificacao notificacao){
        producer.enviar(notificacao);
        return "Notificacao enviada com sucesso";

    }


}
