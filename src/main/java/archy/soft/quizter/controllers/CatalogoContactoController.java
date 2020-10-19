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

import archy.soft.quizter.model.CatalogoContacto;
import archy.soft.quizter.service.CatalogoContactoService;

@RestController
@RequestMapping("/catalogo_contactov1")
public class CatalogoContactoController {
	
	@Autowired
	CatalogoContactoService service;
	
	@GetMapping("/listar")
	public List<CatalogoContacto> listar(){
		return service.listar();
	}
	
	@GetMapping("/listarId/{id}")
	public ResponseEntity<?> listarId(@PathVariable int id) {
		Optional<CatalogoContacto> op = service.listarId(id);
		if(!op.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(op.get());
	}
	
	@PostMapping
	public CatalogoContacto agregar(@RequestBody CatalogoContacto p) {
		
		return service.add(p);
	}
	
	@PutMapping
	public CatalogoContacto edit(@RequestBody CatalogoContacto p) {
		return service.edit(p);
	}
	
	@DeleteMapping("/delete")
	public CatalogoContacto borrar(@RequestBody CatalogoContacto p) {
		return service.delete(p);
	}
	
	@DeleteMapping("/deleteId")
	public CatalogoContacto borrarId(@RequestBody int id) {
		return service.deleteId(id);
	}

}
