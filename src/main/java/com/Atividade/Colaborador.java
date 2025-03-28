package com.Atividade;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "colaborador")
public class Colaborador {
	
	private String nomecolaborador;
	
	@Id
	private String cpfcolaborador;
	
	
	private String senhaacesso;
	
	
	private String datanascimento;
	
	
	private String status;
	
	
	
	public String getNomecolaborador() {
		return nomecolaborador;
	}
	public void setNomecolaborador(String nomecolaborador) {
		this.nomecolaborador = nomecolaborador;
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
