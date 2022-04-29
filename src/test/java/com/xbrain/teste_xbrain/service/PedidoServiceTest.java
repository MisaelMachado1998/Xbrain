package com.xbrain.teste_xbrain.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.xbrain.teste_xbrain.controller.PedidoController;
import com.xbrain.teste_xbrain.model.Pedido;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringRunner.class)
public class PedidoServiceTest {

    private MockMvc mockMvc;

    @Autowired
    PedidoController pedidoController;

    @Before
    public void setUp() {
        this.mockMvc = MockMvcBuilders.standaloneSetup(pedidoController).build();
    }

    @Test
    public void criarPedido() throws Exception {
        Pedido pedido = new Pedido(null, 1, 2, 3, "rua fulano de tal");

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(pedido);

        this.mockMvc.perform(MockMvcRequestBuilders.post("/salvarpedido")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(json)
                )
                .andExpect(MockMvcResultMatchers.status().isCreated());
    }

}
