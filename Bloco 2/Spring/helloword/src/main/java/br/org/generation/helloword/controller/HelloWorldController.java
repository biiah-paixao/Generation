package br.org.generation.helloword.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // dizer que essa classe se trata de um controller
@RequestMapping("/hello") // qual caminho vamos utilizar no postman para acessar esse ponto de acesso, esse controller
// (parametro) - localhost:8080/parametro
public class HelloWorldController {
	
	@GetMapping //metodo de obter recurso dentro do caminho
	public String hello()
	{
		return "Hello World!!";
	}



}
