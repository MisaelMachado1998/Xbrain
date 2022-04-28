package com.xbrain.testexbrain.controller;

import com.xbrain.testexbrain.model.Pedido;
import com.xbrain.testexbrain.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PedidoController {

    @Autowired
    PedidoService pedidoService;

    @PostMapping
    @RequestMapping("/salvarpedido")
    private Pedido salvarPedido(@RequestBody Pedido pedido){
        return pedidoService.salvarPedido(pedido);
    }
}
