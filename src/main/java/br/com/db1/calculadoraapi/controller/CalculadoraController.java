package br.com.db1.calculadoraapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.db1.calculadoraapi.dto.CalculadoraDTO;
import br.com.db1.calculadoraapi.model.Calculadora;
import br.com.db1.calculadoraapi.model.Operacao;
import br.com.db1.calculadoraapi.services.CalculadoraService;
@CrossOrigin
@RestController
@RequestMapping("/api/calculadora")

public class CalculadoraController {
	@Autowired
	private CalculadoraService calculadoraService;

	/*@GetMapping
	public Calculadora salvaOperacao(@RequestParam("numeroUm") Double numeroUm,
			@RequestParam("numeroDois") Double numeroDois, @RequestParam("operacao") Operacao operacao) {
		Calculadora calculadora = calculadoraService.salvaOperacao(numeroUm, numeroDois,operacao);
		return calculadora;
	}*/
	@PostMapping
	public Calculadora salvaOperacao(@RequestBody CalculadoraDTO calculadora  ) {
		return calculadoraService
				.salvaOperacao(calculadora.getNumeroUm(),calculadora.getNumeroDois(),calculadora.getOperacao());
	}
	
	@GetMapping
	public List<Calculadora> todosCalculos(){
	return calculadoraService.buscarTodosCalculos();
	}
	
	
	
	
	
	

}
