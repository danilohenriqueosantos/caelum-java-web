<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<body>

	<c:import url="../cabecalho.jsp" />
	<div class="container">
		<h3>Alterar tarefa - ${tarefa.id}</h3>
		<form action="alteraTarefa" method="post">
			<input type="hidden" name="id" value="${tarefa.id}" /> <br />
			<div class="form-group">
				<label for="descricao">Descrição:</label>
				<textarea id="descricao" class="form-control" name="descricao"
					cols="100" rows="5">${tarefa.descricao}</textarea>
			</div>
			<div class="form-check">
				<input id="finalizado" class="form-check-input" type="checkbox"
					name="finalizado" value="true"
					${tarefa.finalizado? 'checked' : '' }> <label
					class="form-check-label" for="finalizado">Finalizado?</label>
			</div>
			<div class="form-group">
				<label for="dataFinalizacao">Data de finalização:</label>
				 <input  class="form-control" type="text" name="dataFinalizacao"
					value="<fmt:formatDate value="${tarefa.dataFinalizacao.time}" pattern="dd/MM/yyyy" />" />
			</div>
			<br />
			<button class="btn btn-primary" type="submit">Alterar</button>
		</form>


	</div>

</body>
</html>