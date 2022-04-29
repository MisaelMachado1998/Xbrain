package com.xbrain.teste_xbrain.controller;

import com.xbrain.teste_xbrain.dto.PedidoDto;
import com.xbrain.teste_xbrain.model.Pedido;
import com.xbrain.teste_xbrain.model.Produto;
import com.xbrain.teste_xbrain.service.PedidoService;
import com.xbrain.teste_xbrain.service.ProdutoService;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PedidoController {

    @Autowired
    PedidoService pedidoService;

    @Autowired
    ProdutoService produtoService;

    @Contract("_ -> new")
    @PostMapping
    @RequestMapping("/salvarpedido")
    private @NotNull ResponseEntity<Pedido> salvarPedido(@RequestBody PedidoDto pedidoDto){
        Pedido pedidoModel = new Pedido();
        BeanUtils.copyProperties(pedidoDto,pedidoModel);
        pedidoService.salvarPedido(pedidoModel);
        return new ResponseEntity<>(pedidoModel, HttpStatus.CREATED);

    }

    @PostMapping
    @RequestMapping("/salvarproduto")
    private Produto salvarProduto(@RequestBody Produto produto){
        return produtoService.salvarProduto(produto);
    }
}
