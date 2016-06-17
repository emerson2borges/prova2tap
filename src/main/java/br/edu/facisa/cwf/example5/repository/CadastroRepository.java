package br.edu.facisa.cwf.example5.repository;

import java.util.List;

import br.edu.facisa.cwf.example5.domain.Cadastro;

public interface CadastroRepository {
	
	public Cadastro findByName(String name);
	
	public Cadastro findOne(String id);

	public List<Cadastro> findAll();

	public Cadastro save(Cadastro participant);
}
