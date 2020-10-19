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

import archy.soft.quizter.model.Cat_contac;
import archy.soft.quizter.service.Cat_contacService;

@RestController
@RequestMapping("/catalogo_contacto")
public class Cat_contacController {
	
	@Autowired
	Cat_contacService service;
	
	@GetMapping("/listar")
	public List<Cat_contac> listar(){
		return service.listar();
	}
	
	@GetMapping("/listarId/{id}")
	public ResponseEntity<?> listarId(@PathVariable int id) {
		Optional<Cat_contac> op = service.listarId(id);
		if(!op.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(op.get());
		
	}
	
	@PostMapping
	public Cat_contac agregar(@RequestBody Cat_contac p) {
		
		return service.add(p);
	}
	
	@PutMapping
	public Cat_contac edit(@RequestBody Cat_contac p) {
		
		return service.edit(p);
		
	}
	
	@DeleteMapping("/delete")
	public Cat_contac borrar(@RequestBody Cat_contac p) {
		
		return service.delete(p);
		
	}
	
	@DeleteMapping("/deleteId")
	public Cat_contac borrarId(@RequestBody int id) {
		
		return service.deleteId(id);
	}

}
