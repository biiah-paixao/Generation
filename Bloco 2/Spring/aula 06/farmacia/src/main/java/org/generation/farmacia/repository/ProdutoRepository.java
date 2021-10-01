package org.generation.farmacia.repository;

import java.math.BigDecimal;
import java.util.List;

import org.generation.farmacia.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	public List<Produto> findAllByNomeContainingIgnoreCase (String nome);
	
	public List<Produto> findByPrecoGreaterThanOrderByPreco(BigDecimal preco);
	
	public List<Produto> findByPrecoLessThanOrderByPrecoDesc(BigDecimal preco);
}
