package com.xbrain.teste_xbrain.service;

import com.xbrain.teste_xbrain.model.Produto;
import com.xbrain.teste_xbrain.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;

    public Produto salvarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }
}
