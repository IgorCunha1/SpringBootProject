package com.vemPraCalcme.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.vemPraCalcme.domain.Pessoa;

@Repository
public interface PessoaRepository extends MongoRepository<Pessoa, String>{

	
	
}
