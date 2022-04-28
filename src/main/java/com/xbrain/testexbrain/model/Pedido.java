package com.xbrain.testexbrain.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "pedido")
public class Pedido implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int codigoCliente;
    private int codigoProduto;
    private int valor;
    private String enderecoEntrega;
}
