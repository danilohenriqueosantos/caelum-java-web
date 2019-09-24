<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<link rel="shortcut icon" href="images/logo.jpg" type="image/x-icon">
<link rel="stylesheet" href="css/reset.css">
<link rel="stylesheet" href="css/bootstrap.min.css">
<title>Mecânica Soluções</title>
</head>

<body>
	<!-- Imagem e texto -->
	<nav class="navbar navbar-light bg-light">
		<a class="navbar-brand" href="#"> <img src="images/logo.jpg"
			width="40" height="40" class="d-inline-block align-top" alt="">
			Mecânica Soluções
		</a>
	</nav>

	<p>${msg}</p>
	<div class="container">
		<form action="login" method="post">
			<div class="form-group">
				<!-- <label for="login">Endereço de email</label> -->
				<input type="email" class="form-control" id="login" name="login"
					placeholder="Seu login">
			</div>
			<div class="form-group">
				<!-- <label for="Senha">Senha</label> -->
				<input type="password" class="form-control" id="senha" name="senha"
					placeholder="Senha">
			</div>
			<!-- <div class="form-group form-check">
                <input type="checkbox" class="form-check-input" id="exampleCheck1">
                <label class="form-check-label" for="exampleCheck1">Clique em mim</label>
            </div> -->
			<button type="submit" class="btn btn-primary">Enviar</button>
		</form>

	</div>
</body>
</html>