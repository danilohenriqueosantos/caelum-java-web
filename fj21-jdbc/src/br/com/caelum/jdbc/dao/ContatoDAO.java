package br.com.caelum.jdbc.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.caelum.jdbc.ConnectionFactory;
import br.com.caelum.jdbc.modelo.Contato;

public class ContatoDAO {

	private Connection connection = new ConnectionFactory().getConnection();

//	public ContatoDAO() {
//		this.connection = new ConnectionFactory().getConnection();
//	}

	public void adiciona(Contato contato) {
		String sql = "insert into contatos " + "(nome, email, endereco, dataNascimento)" + " values (?, ?, ?, ?)";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getEmail());
			stmt.setString(3, contato.getEndereco());
			stmt.setDate(4, new Date(contato.getDataNascimento().getTimeInMillis()));

			stmt.execute();
			System.out.println("Contato " + contato.getNome() + " inserido com sucesso");
			stmt.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public List<Contato> lista() {
		String sql = "SELECT * FROM contatos";
		ResultSet rs = null;
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			rs = stmt.executeQuery();
			List<Contato> contatos = new ArrayList<Contato>();

			while (rs.next()) {
				Contato contato = new Contato();
				contato.setId(rs.getLong("id"));
				contato.setNome(rs.getString("nome"));
				contato.setEmail(rs.getString("email"));
				contato.setEndereco(rs.getString("endereco"));
				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("dataNascimento"));
				contato.setDataNascimento(data);
				contatos.add(contato);
			}

			return contatos;

		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {

			finaliza(rs);
		}
	}

	private void finaliza(ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void deleta(Contato contato) {
		String sql = "delete from contatos where id = ?";
		PreparedStatement stmt = null;
		try {
			stmt = connection.prepareStatement(sql);
			stmt.setLong(1, contato.getId());
			System.out.println("Contato " + contato.getNome() + " deletado com sucesso!");
			stmt.execute();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
				}
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
			;
		}
	}

	public void altera(Contato contato) {
		String sql = "update contatos set nome=?, email=?, endereco=?, dataNascimento=? where id=?";

		PreparedStatement stmt = null;

		try {
			stmt = connection.prepareStatement(sql);
			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getEmail());
			stmt.setString(3, contato.getEndereco());
			stmt.setDate(4, new Date(contato.getDataNascimento().getTimeInMillis()));
			stmt.setLong(5, contato.getId());
			System.out.println("Dados alerados com sucesso!");
			stmt.execute();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

		finally {

			try {
				if (stmt != null) {
					stmt.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
