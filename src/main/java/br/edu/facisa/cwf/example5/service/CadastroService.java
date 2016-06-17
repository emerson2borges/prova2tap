package br.edu.facisa.cwf.example5.service;

import java.util.List;
import br.edu.facisa.cwf.example5.domain.Cadastro;

public interface CadastroService {
	
	Cadastro save(Cadastro cadastro);
	
	Cadastro getById(String id);
	
	List<Cadastro> listAllCadastro();


}
