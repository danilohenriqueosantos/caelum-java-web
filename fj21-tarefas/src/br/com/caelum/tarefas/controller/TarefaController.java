package br.com.caelum.tarefas.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import br.com.caelum.tarefas.dao.JdbcTarefaDao;
import br.com.caelum.tarefas.modelo.Tarefa;

@Controller
public class TarefaController {
	
	private final JdbcTarefaDao dao;
	
	@Autowired
	public TarefaController(JdbcTarefaDao dao) {
		this.dao = dao;
	}

	@RequestMapping("novaTarefa")
	public String form() {
		return "tarefa/formulario";
	}

	@RequestMapping("adicionaTarefa")
	public String adiciona(@Valid Tarefa tarefa, BindingResult result) {

		if (result.hasErrors()) {
			return "tarefa/formulario";
		}
//		JdbcTarefaDao dao = new JdbcTarefaDao();
		dao.adiciona(tarefa);
		return "tarefa/adicionada";
	}
	
	@RequestMapping("listaTarefas")
	public ModelAndView lista() {
//		JdbcTarefaDao dao = new JdbcTarefaDao();
		List<Tarefa> tarefas = dao.lista();
		
		ModelAndView modelAndView = new ModelAndView("tarefa/lista");
		modelAndView.addObject("tarefas", tarefas);
		return modelAndView;
	}
	
	@RequestMapping("removeTarefa")
	public String remove(Tarefa tarefa) {
//		JdbcTarefaDao dao = new JdbcTarefaDao();
		dao.remove(tarefa);
		
		return "forward:listaTarefas";
	}
	
	@ResponseBody
	@RequestMapping("finalizaTarefa")
	public void finaliza(Long id) {
//		JdbcTarefaDao dao = new JdbcTarefaDao();
		dao.finaliza(id);
	}
	
	@RequestMapping("mostraTarefa")
	public String mostra(Long id, Model model) {
//		JdbcTarefaDao dao = new JdbcTarefaDao();
		model.addAttribute("tarefa", dao.buscaPorId(id));
		return "tarefa/mostra";
		
	}
	
	@RequestMapping("alteraTarefa")
	public String altera(Tarefa tarefa) {
//		JdbcTarefaDao dao = new JdbcTarefaDao();
		dao.altera(tarefa);
		return "redirect:listaTarefas";
		
		
	}

}
