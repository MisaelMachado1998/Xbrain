package com.xbrain.teste_xbrain.service;

import com.xbrain.teste_xbrain.model.Entrega;
import com.xbrain.teste_xbrain.repository.EntregaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntregaService {

    @Autowired
    EntregaRepository entregaRepository;

    public Entrega salvarPedido(Entrega entrega) {
        return entregaRepository.save(entrega);
    }
}
