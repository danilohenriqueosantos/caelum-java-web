package br.com.caelum.jdbc.dao;

import java.util.Calendar;

import br.com.caelum.jdbc.modelo.Contato;

public class InsereConatoTeste {

	public static void main(String[] args) {

		Contato contato = new Contato();
		contato.setNome("Maria");
		contato.setEmail("maria@maria.com.br");
		contato.setEndereco("Av. Fulano de tal, 123");
		contato.setDataNascimento(Calendar.getInstance());
		ContatoDAO contatoDAO = new ContatoDAO();
		contatoDAO.adiciona(contato);

	}

}
