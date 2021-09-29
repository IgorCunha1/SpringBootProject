package com.vemPraCalcme;



import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.vemPraCalcme.repositories.PessoaRepository;

@SpringBootApplication
public class VemPraCalcmeApplication {
	
	@Autowired
	private PessoaRepository categoriaRepository;

	public static void main(String[] args) {
		SpringApplication.run(VemPraCalcmeApplication.class, args);
		

	}


	
}


