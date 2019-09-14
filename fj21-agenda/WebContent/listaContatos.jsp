<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<jsp:useBean id="dao" class="br.com.caelum.agenda.dao.ContatoDao" />

	<table>

		<c:forEach var="contato" items="${dao.lista}">
			<tr>
				<td>${contato.nome}</td>
				<td><c:if test="${not empty contato.email}">
						<a href="mailto:${contato.email}">${contato.email}</a>

					</c:if> 
					<c:if test="${empty contato.email}">
						E-mail não informado.
					</c:if></td>

				<td>${contato.endereco}</td>
				<td>${contato.formataData()}</td>
			</tr>

		</c:forEach>
	</table>

</body>
</html>