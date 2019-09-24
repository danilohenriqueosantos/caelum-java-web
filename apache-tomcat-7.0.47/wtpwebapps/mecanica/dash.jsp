<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="pt-br">

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

<c:url value="/lista" var="lista"/>

    <h1>Cadastro de usuario</h1>
    
    <h2>Usuário logado: ${login}</h2>

    <div class="container">
        <form action="cadastro" method="post">
            <div class="form-group">
                <!-- <label for="login">Endereço de email</label> -->
                <input type="email" class="form-control" id="email" name="email" placeholder="E-mail de cadastro">
            </div>
            <div class="form-group">
                <!-- <label for="Senha">Senha</label> -->
                <input type="password" class="form-control" id="senha" name="senha" placeholder="Senha">
            </div>
            <!-- <div class="form-group form-check">
                    <input type="checkbox" class="form-check-input" id="exampleCheck1">
                    <label class="form-check-label" for="exampleCheck1">Clique em mim</label>
                </div> -->
            <button type="submit" class="btn btn-primary">Cadastrar</button>
        </form>
        
        <a href="${lista}">Listar</a>
    </div>
</body>

</html>