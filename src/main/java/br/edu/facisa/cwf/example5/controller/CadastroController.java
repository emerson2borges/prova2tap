package br.edu.facisa.cwf.example5.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import br.edu.facisa.cwf.example5.domain.Cadastro;
import br.edu.facisa.cwf.example5.service.CadastroService;

@RestController
public class CadastroController {
	
	private final CadastroService cadastroService;
	
	@Autowired
	public CadastroController(final CadastroService userService) {
		this.cadastroService = userService;
	}
		
	@RequestMapping(value="/cadastro", method = RequestMethod.GET)
	public ResponseEntity< List<Cadastro> > listAllCadastro() {
		return new ResponseEntity< List<Cadastro> >
		(cadastroService.listAllCadastro(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/cadastro/{id}",method = RequestMethod.GET)
	public ResponseEntity<Cadastro> getCadastro(@PathVariable String id) {
		
		Cadastro cadastro= cadastroService.getById(id);	
		
		return cadastro == null ? 
				new ResponseEntity<Cadastro>(HttpStatus.NOT_FOUND) : 
					new ResponseEntity<Cadastro>(cadastro, HttpStatus.OK);
	}
	
	@RequestMapping(value="/cadastro", method = RequestMethod.POST)
	public ResponseEntity<String> createCadastro(@RequestBody Cadastro cadastro) {

		try {
			cadastroService.save(cadastro);
			return new ResponseEntity<String>(HttpStatus.CREATED);

		}  catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	@RequestMapping(value = "/cadastro/{id}",method = RequestMethod.DELETE)
	public ResponseEntity<Cadastro> deleteCadastro(@PathVariable String id) {
		try{
			Cadastro cadastroFalso = null;
			if(cadastroFalso == null){
				return new ResponseEntity<Cadastro>(HttpStatus.NOT_FOUND);
			}else{
				return new ResponseEntity<Cadastro>(HttpStatus.OK);
			}
		}catch (Exception e){
			return new ResponseEntity<Cadastro>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@RequestMapping(value = "/cadastro/{id}",method = RequestMethod.PUT)
	public ResponseEntity<Cadastro> atualizaCadastro(@PathVariable String id) {
		try {
			Cadastro cadastroFalso = null;
			if(cadastroFalso == null){
				return new ResponseEntity<Cadastro>(HttpStatus.NOT_FOUND);
			}else{
				return new ResponseEntity<Cadastro>(HttpStatus.OK);
			}
		} catch (Exception e) {
			return new ResponseEntity<Cadastro>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
