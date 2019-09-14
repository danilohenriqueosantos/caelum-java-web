<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Insert title here</title>
</head>
<body>

	<c:import url="cabecalho.jsp" />

	<jsp:useBean id="dao" class="br.com.caelum.agenda.dao.ContatoDao" />

<div class="container">

		<table class="table table-striped">

			<c:forEach var="contato" items="${dao.lista}">
				<tr>
					<td>${contato.nome}</td>
					<td><c:if test="${not empty contato.email}">
							<a href="mailto:${contato.email}">${contato.email}</a>

						</c:if> <c:if test="${empty contato.email}">
						E-mail não informado.
					</c:if></td>

					<td>${contato.endereco}</td>

					<td><fmt:formatDate value="${contato.dataNascimento.time}"
							pattern="dd/MM/yyyy" /></td>
				</tr>
				<td>
					<a href="mvc?logica=RemoveContatoLogic&id=${contato.id}">Remover</a>
				</td>
			</c:forEach>
		</table>

	</div>
	<c:import url="rodape.jsp" />
</body>
</html>