package br.com.caelum.jdbc.teste;

import java.util.List;

import br.com.caelum.jdbc.dao.ContatoDAO;
import br.com.caelum.jdbc.modelo.Contato;

public class ListaContatos {

	public static void main(String[] args) {

		List<Contato> contatos = new ContatoDAO().lista();

		for (Contato contato : contatos) {
			System.out.println(contato);

		}
	}
}
