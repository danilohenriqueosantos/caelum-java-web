package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDAO;
import br.com.caelum.jdbc.modelo.Contato;

public class AlteraContao {
	
	public static void main(String[] args) {
		
		Contato contato = new Contato();
		contato.setNome("Debora");
		contato.setEmail("debora@debora.com.br");
		contato.setEndereco("Rua Fulano de tal 321");
		contato.setDataNascimento(Calendar.getInstance());
		contato.setId((long) 3);
		
		ContatoDAO contatoDAO = new ContatoDAO();
		contatoDAO.altera(contato);
	}

}
