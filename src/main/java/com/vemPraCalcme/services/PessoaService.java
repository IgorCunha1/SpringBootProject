package com.vemPraCalcme.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vemPraCalcme.domain.Pessoa;
import com.vemPraCalcme.repositories.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository repo;
	
	public List<Pessoa> findAll() {
		List<Pessoa> obj = repo.findAll();
		return obj;
	}
	
	
	public Pessoa createCalcme(Pessoa obj) {
		return repo.save(obj);
	}
	
	
}
