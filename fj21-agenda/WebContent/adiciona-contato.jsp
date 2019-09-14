<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="caelum"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="css/jquery.css" rel="stylesheet">
<script src="js/jquery.js"></script>
<script src="js/jquery-ui.js"></script>

<title>Adicona contato</title>
</head>
<body>
	<c:import url="cabecalho.jsp" />

<!-- 	<form action="adicionaContato"> -->
<!-- 		Nome: <input type="text" name="nome"> <br /> E-mail: <input -->
<!-- 			type="text" name="email"> <br /> Endereço: <input -->
<!-- 			type="text" name="endereco"> <br /> Data Nascimento: -->
<%-- 		<caelum:campoData id="dataNascimento" /> --%>

<!-- 		<input type="submit" value="Gravar"> -->
<!-- 	</form> -->

	<div class="container">
		<form action="adicionaContato">
			<div class="form-group form-check">
				<input type="text" class="form-control" id="nome"
					placeholder="Seu nome" name="nome">
			</div>
			<div class="form-group form-check">
				<input type="text" class="form-control" id="email"
					placeholder="Seu Email" name="email">
			</div>
			<div class="form-group form-check">
				<input type="text" class="form-control" id="endereco"
					placeholder="Seu Endereco" name="endereco">
			</div>
			<caelum:campoData id="dataNascimento"></caelum:campoData>
			<button type="submit" class="btn btn-primary">Enviar</button>
		</form>
	</div>

	<c:import url="rodape.jsp" />
</body>
</html>