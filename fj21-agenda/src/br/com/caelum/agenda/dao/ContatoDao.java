package br.com.caelum.agenda.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.caelum.agenda.ConnectionFactory;
import br.com.caelum.agenda.modelo.Contato;

public class ContatoDao {
	private Connection conn;
	private PreparedStatement stmt = null;
	private ResultSet rs = null;

	public ContatoDao() {
		this.conn = ConnectionFactory.getConnection();
		
		
	}

	public ContatoDao(Connection connection) {
		this.conn = connection;
	}

	public void adiciona(Contato contato) {
		try {
			String sql = "insert into contatos (nome, email, endereco, dataNascimento) values (?,?,?,?)";
			this.stmt = this.conn.prepareStatement(sql);

			this.stmt.setString(1, contato.getNome());
			this.stmt.setString(2, contato.getEmail());
			this.stmt.setString(3, contato.getEndereco());
			this.stmt.setDate(4, new Date(contato.getDataNascimento().getTimeInMillis()));

			this.stmt.execute();
			this.stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			ConnectionFactory.closeConnection(conn, stmt);
		}
	}

	public List<Contato> getLista() {
		try {
			List<Contato> contatos = new ArrayList<Contato>();
			this.stmt = this.conn.prepareStatement("select * from contatos");

			this.rs = this.stmt.executeQuery();

			while(this.rs.next()) {
				Contato contato = new Contato();
				//popula o objeto contato
				contato.setId(rs.getLong("id"));
				contato.setNome(rs.getString("nome"));
				contato.setEmail(rs.getString("email"));
				contato.setEndereco(rs.getString("endereco"));

				//popula a data de nascimento do contato, fazendo a conversao
				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("dataNascimento"));
				contato.setDataNascimento(data);

				//adiciona o contato na lista
				contatos.add(contato);
			}

			this.rs.close();
			this.stmt.close();

			return contatos;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			ConnectionFactory.closeConnection(conn, stmt, rs);
		}
	}

	public void exclui(Contato contato) {
		String sql = "delete from contatos where id=?";
		try {
			this.stmt = this.conn.prepareStatement(sql);
			stmt.setLong(1, contato.getId());
			stmt.execute();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			ConnectionFactory.closeConnection(conn, stmt);
		}
	}

	public void atualiza(Contato contato) {
		String sql = "update contatos set nome = ?, email = ?, endereco = ?, dataNascimento = ? where id = ?";
		try {
			this.stmt = this.conn.prepareStatement(sql);
			this.stmt.setString(1, contato.getNome());
			this.stmt.setString(2, contato.getEmail());
			this.stmt.setString(3, contato.getEndereco());
			this.stmt.setDate(4, new java.sql.Date(contato.getDataNascimento().getTimeInMillis()));
			this.stmt.setLong(5, contato.getId());

			this.stmt.execute();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			ConnectionFactory.closeConnection(conn, stmt);
		}
	}
}
