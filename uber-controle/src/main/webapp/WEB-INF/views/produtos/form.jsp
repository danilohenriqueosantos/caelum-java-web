<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Controle Uber</title>
</head>
<body>

	<form action="/uber-controle/produtos" method="post">
		<div>
			<label>Título</label> 
			<input type="text" name="titulo" />
		</div>
		<div>
			<label>Descrição</label>
			<textarea rows="10" cols="20" name="descricao"></textarea>
		</div>
		<div>
			<label>Páginas</label> 
			<input type="text" name="paginas">
		</div>
		<button type="submit">Cadastrar</button>
	</form>

</body>
</html>