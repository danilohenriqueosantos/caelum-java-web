package br.com.caelum.tarefas.jpa;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.caelum.tarefas.modelo.Tarefa;

public class GeraTabelas {

	
	public static void main(String[] args) {
		
		Tarefa tarefa = new Tarefa();
		tarefa.setId(1L);
		tarefa.setDescricao("Estudar Hibernate");
		tarefa.setFinalizado(false);
		tarefa.setDataFinalizacao(Calendar.getInstance());
//		
//		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
//		EntityManager manager = factory.createEntityManager();
//		
//		manager.getTransaction().begin();
//		manager.persist(tarefa);
//		manager.getTransaction().commit();
//		
//		manager.close();
//		factory.close();
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
		EntityManager manager = factory.createEntityManager();
		
//		Tarefa tarefaEncontrada = manager.find(Tarefa.class, 2L);
		
		manager.getTransaction().begin();
//		manager.remove(tarefaEncontrada);
		manager.merge(tarefa);
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
		
		
		
		
		
	}
}
