package archy.soft.quizter.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.base.Optional;

import archy.soft.quizter.model.ContactoUsuario;
import archy.soft.quizter.service.ContactoUsuarioService;

@RestController
@RequestMapping("/contacto_usuarios")
public class ContactoUsuarioController {
	
	@Autowired
	ContactoUsuarioService service;
	
	@GetMapping("/listar")
	public List<ContactoUsuario> listar(){
		return service.listar();
	}
	
	@GetMapping("/listarId/{id}")
	public ResponseEntity<?> listarId(@PathVariable int id) {
		Optional<ContactoUsuario> op = service.listarId(id);
		if(!op.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(op.get());
	}
	
	@PostMapping
	public ContactoUsuario agregar(@RequestBody ContactoUsuario p) {
		
		return service.add(p);
	}
	
	@PutMapping
	public ContactoUsuario edit(@RequestBody ContactoUsuario p) {
		return service.edit(p);
	}
	
	@DeleteMapping("/delete")
	public ContactoUsuario borrar(@RequestBody ContactoUsuario p) {
		return service.delete(p);
	}
	
	@DeleteMapping("/deleteId")
	public ContactoUsuario borrarId(@RequestBody int id) {
		return service.deleteId(id);
	}

}
