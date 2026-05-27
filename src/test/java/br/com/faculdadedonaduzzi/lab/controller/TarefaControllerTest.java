package br.com.faculdadedonaduzzi.lab.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class TarefaControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetAllTasks() throws Exception {
        // O ERRO INTENCIONAL ESTÁ AQUI: Chamando "/tarefa" em vez de "/tarefas"
        mockMvc.perform(get("/tarefa"))
                .andExpect(status().isOk());
    }
}