package com.Atividade;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Professor")
public class Professor {
	
	private String nomeprofessor;
	
	@Id
	private String cpfprofessor;
	
	
	private String senhaacesso;
	
	
	private String datanascimento;
	
	
	private String status;


	public String getNomeprofessor() {
		return nomeprofessor;
	}


	public void setNomeprofessor(String nomeprofessor) {
		this.nomeprofessor = nomeprofessor;
	}


	public String getCpfprofessor() {
		return cpfprofessor;
	}


	public void setCpfprofessor(String cpfprofessor) {
		this.cpfprofessor = cpfprofessor;
	}


	public String getSenhaacesso() {
		return senhaacesso;
	}


	public void setSenhaacesso(String senhaacesso) {
		this.senhaacesso = senhaacesso;
	}


	public String getDatanascimento() {
		return datanascimento;
	}


	public void setDatanascimento(String datanascimento) {
		this.datanascimento = datanascimento;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
	

}
