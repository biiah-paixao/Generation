package br.org.generation.helloobjetivos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class HelloObjetivosController {
	
	@GetMapping
	public String Objetivos()
	{
		return "<h1> Meus objetivos de aprendizagem para essa semana:</h1> "
				+ "<ul>"
				+ "		<li> Aprender a fazer um CRUD no Spring!</li><br>"
				+ "		<li> Aprender mais sobre Spring</li><br>"
				+ "		<li> Apresender mais sobre MySQL</li>"
				+ "</ul>" ;
		
	}

}
