package com.xbrain.teste_xbrain.service;

import com.xbrain.teste_xbrain.model.Pedido;
import com.xbrain.teste_xbrain.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {

    @Autowired
    PedidoRepository pedidoRepository;

    public Pedido salvarPedido(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

}
