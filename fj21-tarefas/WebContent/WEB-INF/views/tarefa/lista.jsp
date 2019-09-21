<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<a href="novaTarefa">Criar nova tarefa</a>

<table>
	<tr>
		<td>Id</td>
		<td>Descrição</td>
		<td>Finalizado</td>
		<td>Data de finalização</td>
	</tr>
	
	<c:forEach var="tarefa" items="${tarefas}">
		<tr>
			<td>${tarefa.id}</td>
			<td>${tarefa.descricao}</td>
			<c:if test="${tarefa.finalizado eq false}">
				<td>Não finalizado</td>
			</c:if>
			<c:if test="${tarefa.finalizado eq true}">
				<td>Finalizado</td>
			</c:if>
			<td><fmt:formatDate value="${tarefa.dataFinalizacao.time}" pattern="dd/MM/yyyy"/></td>
			<td><a href="removeTarefa?id=${tarefa.id}">Remover</a></td>
			<td><a href="novaTarefa?id=${tarefa.id}">Alterar</a></td>
		</tr>
	</c:forEach>
</table>

</body>
</html>