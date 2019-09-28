<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:import url="../cabecalho.jsp" />

<div class="container">
	<h3>Adiciona Tarefa</h3>
	
	<form action="adicionaTarefa" method="post">
		<form:errors path="tarefa.descricao" cssStyle="color:red" /> 
		<div class="form-group">
			<label for="descricao">Descrição</label>
			<textarea class="form-control" id="descricao" name="descricao" rows="5" cols="100" ></textarea>
		</div>
		 
		<div class="form-group">
			<input class="btn btn-primary" type="submit" value="Adicionar"> 
		</div>
	</form>
	

</div>
<c:import url="../rodape.jsp" />
</body>
</html>