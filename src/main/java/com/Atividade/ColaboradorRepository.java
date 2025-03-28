package com.Atividade;

import org.springframework.data.repository.CrudRepository;

public interface ColaboradorRepository extends CrudRepository<Colaborador, String>{
	
	Colaborador findBycpfcolaborador(String cpfcolaborador);

}
