package org.generation.minhaLojaDeGames.controller;

import java.util.List;

import org.generation.minhaLojaDeGames.model.Categoria;
import org.generation.minhaLojaDeGames.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categoria")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CategoriaController {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@GetMapping //traz todas as categorias
	public ResponseEntity<List<Categoria>> getAll() {
		return ResponseEntity.ok(categoriaRepository.findAll());
	}
	
	@GetMapping("/{id}") //trazer uma unica categoria por ID
	public ResponseEntity<Categoria> getById(@PathVariable long id) {
		return categoriaRepository.findById(id)
				.map(resposta -> ResponseEntity.ok(resposta))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/genero/{genero}") // trazer por um tipo especifico
	public ResponseEntity<List<Categoria>> getByTipo(@PathVariable String genero) {
		return ResponseEntity.ok(categoriaRepository.findAllByGeneroContainingIgnoreCase(genero));
	}

	@PostMapping //gravar uma categoria
	public ResponseEntity<Categoria> postCategoria(@RequestBody Categoria categoria) {
		return ResponseEntity.status(HttpStatus.CREATED).body(categoriaRepository.save(categoria));
	}
	
	@PutMapping //atualizar uma categoria
	public ResponseEntity<Categoria> putCategotia(@RequestBody Categoria categoria) {
		return ResponseEntity.status(HttpStatus.OK).body(categoriaRepository.save(categoria));
	}
	
	
	@DeleteMapping("/{id}") // deletar categoria atraves do id
	public void deleteCategoria(@PathVariable long id) {
		categoriaRepository.deleteById(id);
	}

	
}
