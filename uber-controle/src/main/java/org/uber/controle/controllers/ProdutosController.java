package org.uber.controle.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.uber.controle.models.Produto;

@Controller
public class ProdutosController {

	@RequestMapping("produtos/form")
	public String form() {
		return "produtos/form";
	}
	
	@RequestMapping("/produtos")
	public String grava(Produto produto) {
		System.out.println(produto);
		
		return "produtos/ok";
	}
}
