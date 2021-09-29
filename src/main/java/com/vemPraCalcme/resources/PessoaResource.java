package com.vemPraCalcme.resources;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.vemPraCalcme.domain.Pessoa;
import com.vemPraCalcme.services.PessoaService;

@RestController
@RequestMapping(value="/pessoa")
@CrossOrigin(origins = "http://localhost:4200")
public class PessoaResource {
	
	@Autowired
	private PessoaService service;
	
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<Pessoa>> findAll() {
	List<Pessoa> list = service.findAll();
	return ResponseEntity.ok().body(list);
	}
	
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> insert(@RequestBody Pessoa obj) {
		obj = service.createCalcme(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
		
	}
	
	
}
