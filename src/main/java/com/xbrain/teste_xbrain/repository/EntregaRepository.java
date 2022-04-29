package com.xbrain.teste_xbrain.repository;

import com.xbrain.teste_xbrain.model.Entrega;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EntregaRepository extends JpaRepository<Entrega, UUID> {
}
