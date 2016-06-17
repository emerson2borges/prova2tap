package br.edu.facisa.cwf.example5.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cadastro {
	
	private static final long serialVersionUID = -7799369695818057571L;
	
	@Id
	private String id;
	private String nome;
	private String descricao;
	
	public Cadastro(){}
	
	public Cadastro(String id, String nome, String descricao){
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
