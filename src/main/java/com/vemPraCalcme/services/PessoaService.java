package com.vemPraCalcme.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vemPraCalcme.domain.Pessoa;
import com.vemPraCalcme.repositories.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository repo;
	
	public Pessoa Buscar(Integer id) {
		Optional<Pessoa> obj = repo.findById(id);
		return obj.orElse(null);
	}
	
}
