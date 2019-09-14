package br.com.caelum.agenda;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionFactory {

	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/fj21", "root", "");
		} catch (SQLException | ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}

	public static void closeConnection(Connection conn) {
		try {
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public static void closeConnection(Connection conn, PreparedStatement stmt) {
		try {
			closeConnection(conn);
			if (stmt != null) {
				stmt.close();
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public static void closeConnection(Connection conn, PreparedStatement stmt, ResultSet rs) {
		try {
			closeConnection(conn, stmt);
			if (rs != null) {
				rs.close();
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
