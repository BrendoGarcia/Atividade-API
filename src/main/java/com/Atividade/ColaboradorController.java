package com.Atividade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ColaboradorController {
	
	@Autowired
	private ColaboradorRepository CR;
	
	@GetMapping("/colaborador")
	@CrossOrigin
	public Iterable<Colaborador> Colaborador() {
		return CR.findAll();
	}
	
	@PostMapping("/registrar")
	@CrossOrigin
	public ResponseEntity<String> userCadastro(@RequestBody Colaborador colaborador) {
	        // Codificar a senha antes de salvar
	        CR.save(colaborador);
	        return ResponseEntity.status(HttpStatus.CREATED).body("Usuário cadastrado com sucesso");
	}

}
