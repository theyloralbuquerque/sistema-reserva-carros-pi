package com.projetointegrador.reservacarros.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetointegrador.reservacarros.entities.Carro;
import com.projetointegrador.reservacarros.services.CarroService;

@RestController
@RequestMapping(value = "/carros")
public class CarroResource {
	
	@Autowired
	private CarroService service;
	
	@GetMapping
	public ResponseEntity <List<Carro>> findAll() { // O método findAll() será um endpoint para acessar os carros.
		List<Carro> list = service.findAll(); // Chama o método findAll() da classe CarroService.
		return ResponseEntity.ok().body(list); // Define como retorno do método o corpo (body) da list, que é um tipo ResponseEntity.
	}
}
