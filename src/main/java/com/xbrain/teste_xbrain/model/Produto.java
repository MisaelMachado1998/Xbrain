package com.xbrain.teste_xbrain.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Produto {
    @Id
    private UUID id;
    private String nome;
    private String valor;

}
