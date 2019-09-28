package br.com.caelum.tarefas.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.caelum.tarefas.modelo.Tarefa;

public class BuscaRegistro {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
		EntityManager manager = factory.createEntityManager();
		
		Tarefa tarefaEncontrada = manager.find(Tarefa.class, 1L);
		System.out.println(tarefaEncontrada.getDescricao());
		
		manager.close();
		factory.close();
	}

}
