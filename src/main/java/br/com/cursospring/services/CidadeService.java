package br.com.cursospring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cursospring.domain.Cidade;
import br.com.cursospring.repositories.CidadeRepository;

@Service
public class CidadeService {
	
	@Autowired CidadeRepository repo;
	
	public List<Cidade> findByEstado(Integer estadoId){
		return repo.findCidade(estadoId);
	}

}
