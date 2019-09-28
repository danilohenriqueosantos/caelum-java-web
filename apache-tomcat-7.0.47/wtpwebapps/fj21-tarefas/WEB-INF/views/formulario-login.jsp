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
	<div class="container">
		<h2>Página de login das tarefas</h2>

		<form action="efetuaLogin" method="post">
			<div class="form-group">
				Login: <input class="form-control" type="text" name="login" /><br>
			</div>
			<div class="form-group">
				Senha: <input class="form-control" type="password" name="senha" />
			</div>
			<div class="form-group">
				<button class="btn btn-primary" type="submit">Entrar nas tarefas</button>
			</div>
		</form>

	</div>

</body>
</html>