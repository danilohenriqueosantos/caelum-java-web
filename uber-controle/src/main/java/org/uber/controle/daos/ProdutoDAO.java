package org.uber.controle.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.uber.controle.models.Produto;

@Repository
public class ProdutoDAO {

	@PersistenceContext
	private EntityManager manager; 
	
	public void gravar(Produto produto) {
		manager.persist(produto);
	}
}
