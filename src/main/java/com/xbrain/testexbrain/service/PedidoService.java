package com.xbrain.testexbrain.service;

import com.xbrain.testexbrain.model.Pedido;
import com.xbrain.testexbrain.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {

    @Autowired
    PedidoRepository pedidoRepository;
    public Pedido salvarPedido(Pedido pedido){
     return pedidoRepository.save(pedido);
    }
}
