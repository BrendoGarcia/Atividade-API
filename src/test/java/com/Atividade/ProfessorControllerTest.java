package com.Atividade;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class ProfessorControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void deveRetornarListaDeProfessores() throws Exception {
        mockMvc.perform(get("/professor"))
                .andExpect(status().isOk());
    }

    @Test
    void deveCadastrarProfessorComSucesso() throws Exception {
        Professor novoProfessor = new Professor();
        novoProfessor.setNomeprofessor("João da Silva");
        novoProfessor.setCpfprofessor("12345678996");
        novoProfessor.setSenhaacesso("123456");

        mockMvc.perform(post("/registrar")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(novoProfessor)))
                .andExpect(status().isCreated())
                .andExpect(content().string("Usuário cadastrado com sucesso"));
    }
}
