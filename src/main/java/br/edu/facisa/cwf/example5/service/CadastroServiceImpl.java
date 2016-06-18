package br.edu.facisa.cwf.example5.service;

import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import br.edu.facisa.cwf.example5.domain.Cadastro;
import br.edu.facisa.cwf.example5.repository.CadastroRepository;


@Service
@Validated
public class CadastroServiceImpl implements CadastroService {
	
    private final CadastroRepository cadastro;

    @Autowired
    public CadastroServiceImpl(final CadastroRepository cadastro) {
        this.cadastro= cadastro;
    }
    
    public Cadastro getById(String id) {    
    	return cadastro.findOne(id);
    }
    
	public List<Cadastro> listAllCadastro() {
		return cadastro.findAll();
	}
	
    @Transactional
    public Cadastro save(@NotNull @Valid final Cadastro participant) {
    	
        Cadastro existing = cadastro.findOne(participant.getNome());
        
        return cadastro.save(participant);
    }

	public CadastroRepository getCadastro() {
		return cadastro;
	}
	 
}
