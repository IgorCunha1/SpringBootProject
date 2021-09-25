package com.vemPraCalcme.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vemPraCalcme.domain.Pessoa;

@RestController
@RequestMapping(value="/pessoas")
public class PessoaResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Pessoa> listar() {
		
		Pessoa p = new Pessoa();
		Pessoa q = new Pessoa();
		
		p.setNome("Igor");
		p.setEmail("igorivson@outlook.com");
		p.setTelefone("81999302640");
		
		q.setNome("Joao");
		q.setEmail("Joao@outlook.com");
		q.setTelefone("81999302640");
		
		List<Pessoa> lista = new ArrayList<>();
		
		lista.add(p);
		lista.add(q);
		
		return lista;
	}
	
}
