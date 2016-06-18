package br.edu.facisa.cwf.example5.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.facisa.cwf.example5.domain.Cadastro;

public interface CadastroRepository extends JpaRepository<Cadastro, String>{

}
