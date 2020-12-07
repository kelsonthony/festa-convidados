package com.kelsonthony.festa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kelsonthony.festa.repository.Convidados;

@Controller
public class ConvidadosController {
	
	@Autowired
	private Convidados convidados;
	
	@GetMapping("/convidados")
	public ModelAndView listar() {
		
		ModelAndView modelandview = new ModelAndView("ListaConvidados");
		
		modelandview.addObject("convidados", convidados.findAll());
		
		return modelandview;
	}
}
