package com.Atividade;

import org.springframework.data.repository.CrudRepository;

public interface ProfessorRepository extends CrudRepository<Professor, String>{
	
	Professor findBycpfprofessor(String cpfprofessor);

}
