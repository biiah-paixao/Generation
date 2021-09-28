package br.org.generation.hellobsm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm")
public class HelloBsmController {
	
	@GetMapping
	public String habilidadesMentalidades()
	{
		return "<h1> Mentalidades e Habilidades utilizadas hoje: </h1> "
				+ "<ul>"
				+ "		<li> <b>Persistencia - </b> porque tive que persistir ao aprender uma linguagem nova</li><br>"
				+ "		<li> <b>Atenção aos detalhes - </b> por ser um codigo é preciso ter muita atenção, qualquer erro o codigo não funciona</li><br>"
				+ "		<li> <b>Mentalidade de Crescimento - </b> quero aprender maais é uma nova linguagem tudo novo </li>" ;
	}

}
