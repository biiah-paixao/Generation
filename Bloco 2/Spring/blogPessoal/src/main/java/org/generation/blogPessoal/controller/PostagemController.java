package org.generation.blogPessoal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.generation.blogPessoal.model.Postagem;
import org.generation.blogPessoal.repository.PostagemRepository;

@RestController //anotações para informar que essa classe é um controller
@RequestMapping("/postagens") //por qual URI que essa classe será acessada
@CrossOrigin(origins = "*", allowedHeaders = "*") // essa classe vai aceitar requisição de qualquer origem o * significa todos
public class PostagemController {
	
	//ingerar a classe de repository
	@Autowired // responsabilidade de instanciação dessa interface para o spring - ingessão de dependencia
	private PostagemRepository repository; // objeto da interface repository
	
	//primeiro metodo - find all
	@GetMapping
	public ResponseEntity<List<Postagem>> GetAll() 
	{
		return ResponseEntity.ok(repository.findAll());
	} // findAll é igual a select * from tb_postagens

}
