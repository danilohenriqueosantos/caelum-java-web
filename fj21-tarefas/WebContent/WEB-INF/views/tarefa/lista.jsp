<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="resources/js/jquery.js"></script>
<title>Insert title here</title>
</head>
<body>
<c:import url="../cabecalho.jsp" />
<script type="text/javascript">
function finalizaAgora(id) {
	$.post("finalizaTarefa", {'id': id}, function () {
		//Selecionando o elemento html através da
		// ID e alterando o HTML dele
		$("#tarefa_"+id).html("Finalizado");
		
	});
}</script>

<a href="novaTarefa">Criar nova tarefa</a>

<table class="table table-striped">
	<tr>
		<td scope="col">Id</td>
		<td scope="col">Descrição</td>
		<td scope="col">Finalizado</td>
		<td scope="col">Data de finalização</td>
		<td scope="col">Alterar</td>
		<td scope="col">Remover</td>
	</tr>
	
	<c:forEach var="tarefa" items="${tarefas}">
		<tr>
			<td>${tarefa.id}</td>
			<td>${tarefa.descricao}</td>
			<c:if test="${tarefa.finalizado eq false}">
				<td id="tarefa_${tarefa.id}">
				<a class="btn btn-success" href="#" onclick="finalizaAgora(${tarefa.id})">Finalizar agora!</a></td>
			</c:if>
			<c:if test="${tarefa.finalizado eq true}">
				<td>Finalizado</td>
			</c:if>
			<td><fmt:formatDate value="${tarefa.dataFinalizacao.time}" pattern="dd/MM/yyyy"/></td>
			<td><a class="btn btn-warning" href="mostraTarefa?id=${tarefa.id}">Alterar</a></td>
			<td><a class="btn btn-danger" href="removeTarefa?id=${tarefa.id}">Remover</a></td>
		</tr>
	</c:forEach>
</table>

</body>
</html>