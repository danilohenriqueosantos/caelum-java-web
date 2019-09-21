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

	<h3>Adiciona Tarefa</h3>
	
	<form action="adicionaTarefa" method="post">
		<form:errors path="tarefa.descricao" cssStyle="color:red" /> <br>
		Descrição <br>
		<textarea name="descricao" rows="5" cols="100" ></textarea>
		
		<input type="submit" value="Adicionar"> 
	</form>
	
<c:import url="../rodape.jsp" />
</body>
</html>