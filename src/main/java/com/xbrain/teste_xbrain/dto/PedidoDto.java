package com.xbrain.teste_xbrain.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class PedidoDto {

    private UUID id;
    private Integer codigoCliente;
    private Integer codigoProduto;
    private Integer valor;
    private String enderecoEntrega;

}
