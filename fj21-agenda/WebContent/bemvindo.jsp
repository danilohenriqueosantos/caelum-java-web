<%@page import="br.com.caelum.agenda.modelo.Contato"%>
<%@page import="java.util.List"%>
<%@page import="br.com.caelum.agenda.dao.ContatoDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP</title>
</head>
<body>

	<%-- Comentário em JSP aqui: nossa primeira página JSP --%>

	<%
		String mensagem = "Bem vindo ao sistema de agenda do FJ-21!";
	%>

	<%
		out.println(mensagem);
	%>

	<%
		String desenvolvido = "Desenvolvido por Danilo Santos";
	%>

	<%=desenvolvido%>

	<br>

	<%
		System.out.println("Tudo foi executado!");
	%>

	<%
		ContatoDao dao = new ContatoDao();
		List<Contato> contatos = dao.getLista();

		for (Contato contato : contatos) {
	%>
	<li><%=contato.getNome()%>, 
	<%=contato.getEmail()%> : <%=contato.getEndereco()%>
	</li>
	<%
		}
	%>

</body>
</html>