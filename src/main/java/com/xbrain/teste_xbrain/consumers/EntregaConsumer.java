package com.xbrain.teste_xbrain.consumers;

import com.xbrain.teste_xbrain.dto.EntregaDto;
import com.xbrain.teste_xbrain.dto.PedidoDto;
import com.xbrain.teste_xbrain.model.Entrega;
import com.xbrain.teste_xbrain.service.EntregaService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class EntregaConsumer {

    @Autowired
    EntregaService entregaService;

    @RabbitListener(queues = "${spring.rabbitmq.queue}")
    public void listen(@Payload PedidoDto pedidoDto) {
        EntregaDto entregaDto = new EntregaDto();
        Entrega entregaModel = new Entrega();
        entregaDto.setEndereco(pedidoDto.getEnderecoEntrega());
        entregaDto.setIdPedido(pedidoDto.getId());
        BeanUtils.copyProperties(entregaDto, entregaModel);

        entregaService.salvarPedido(entregaModel);
    }
}
