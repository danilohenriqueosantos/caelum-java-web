package br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.dao.ContatoDAO;
import br.com.caelum.jdbc.modelo.Contato;

public class DeletaContato {
	
	public static void main(String[] args) {
		
		Contato contato = new Contato();
		contato.setId((long) 2);
		
		ContatoDAO contatoDAO = new ContatoDAO();
		contatoDAO.deleta(contato);
	}

}
