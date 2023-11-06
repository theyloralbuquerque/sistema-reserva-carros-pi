package com.projetointegrador.reservacarros.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetointegrador.reservacarros.entities.Usuario;
import com.projetointegrador.reservacarros.services.UsuarioService;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioResource {
	
	@Autowired
	private UsuarioService service;
	
	@GetMapping
	public ResponseEntity <List<Usuario>> findAll() { // O método findAll() será um endpoint para acessar os usuarios.
		List<Usuario> list = service.findAll(); // Chama o método findAll() da classe UsuarioService.
		return ResponseEntity.ok().body(list); // Define como retorno do método o corpo (body) da list, que é um tipo ResponseEntity.
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Usuario> findById(@PathVariable Long id) { // O método findById() será um endpoint para acessar o usuario conforme o id passado como parâmetro.
		Usuario obj = service.findById(id); // Chama o método findAById() da classe UsuarioService.
		return ResponseEntity.ok().body(obj); // Define como retorno do método o corpo (body) do obj, que é um tipo ResponseEntity.
	}
}
