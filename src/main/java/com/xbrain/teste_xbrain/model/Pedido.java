package com.xbrain.teste_xbrain.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Data
@Table(name = "pedido")
@NoArgsConstructor
public class Pedido implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private Integer codigoCliente;
    private Integer codigoProduto;
    private Integer valor;
    private String enderecoEntrega;

    public Pedido(UUID id, Integer codigoCliente, Integer codigoProduto, Integer valor, String enderecoEntrega) {
        super();
        this.id = id;
        this.codigoCliente = codigoCliente;
        this.codigoProduto = codigoProduto;
        this.valor = valor;
        this.enderecoEntrega = enderecoEntrega;
    }
}
