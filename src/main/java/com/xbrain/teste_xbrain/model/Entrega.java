package com.xbrain.teste_xbrain.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Entrega {

    @Id
    private UUID id;
    private String endereco;
    private Integer idPedido;
}
