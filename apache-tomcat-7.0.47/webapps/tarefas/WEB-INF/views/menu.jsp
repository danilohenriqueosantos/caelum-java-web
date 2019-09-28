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
	<h2>Páginas inicial da Lista de Tarefas</h2>
	<p>Bem vindo, ${usuarioLogado.login}</p>
	<div class="container">
		<div class="form-group">
			<a class="btn btn-primary btn-lg btn-block" href="listaTarefas">Clique aqui para acessar a lista de tarefas</a> 
		</div>
		<div class="form-group">
			<a class="btn btn-danger btn-lg btn-block" href="logout">Sair do sistema</a>
		</div>

	</div>
</body>
</html>