package org.generation.blogPessoal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.generation.blogpessoal.model.Postagem;
import br.org.generation.blogpessoal.repository.PostagemRepository;

@RestController //anota��es para informar que essa classe � um controller
@RequestMapping("/postagens") //por qual URI que essa classe ser� acessada
@CrossOrigin(origins = "*", allowedHeaders = "*") // essa classe vai aceitar requisi��o de qualquer origem o * significa todos
public class PostagemController {
	
	//ingerar a classe de repository
	@Autowired // responsabilidade de instancia��o dessa interface para o spring - ingess�o de dependencia
	private PostagemRepository postagemRepository; // objeto da interface repository
	
	//primeiro metodo - find all
	@GetMapping
	public ResponseEntity<List<Postagem>> getAll() 
	{
		return ResponseEntity.ok(postagemRepository.findAll());
	} // findAll � igual a select * from tb_postagens