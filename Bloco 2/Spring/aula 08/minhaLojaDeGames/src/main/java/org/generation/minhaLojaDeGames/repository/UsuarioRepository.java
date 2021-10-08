package org.generation.minhaLojaDeGames.repository;

import java.util.Optional;

import org.generation.minhaLojaDeGames.model.Produto;
import org.generation.minhaLojaDeGames.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Produto, Long> {
	
	public Optional<Usuario> findByUsuario(String usuario);

}
