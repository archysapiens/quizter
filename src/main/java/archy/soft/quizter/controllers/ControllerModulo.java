package archy.soft.quizter.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.base.Optional;

import archy.soft.quizter.model.Modulo;
import archy.soft.quizter.service.ModuloService;

@RestController
@RequestMapping("/modulo")
public class ControllerModulo {
	
	
	private static Logger log = LoggerFactory.getLogger(ControllerMain.class);
	
	@Autowired
	ModuloService service;
	
	@GetMapping("/listar")
	public List<Modulo> listar(){
		return service.listar();
	}
	@GetMapping("/listarId/{id}")
	public ResponseEntity<?> listarId(@PathVariable int id) {
	Optional<Modulo> op = service.listarId(id);
	if(!op.isPresent()) {
		return ResponseEntity.notFound().build();
	}
	return ResponseEntity.ok(op.get());
		
	}
	
	
	
	@PostMapping
    public Modulo agregar(@RequestBody Modulo p) {	
		log.info("agregar {} --  {}",p.getDescripcion());
		return service.add(p);
	}
	
	@PutMapping
	public Modulo edit(@RequestBody Modulo p) {
		
		return service.delete(p);
	}
	
	//@DeleteMapping("/delete")
	//public Modulo borrar(@RequestBody Modulo p) {
	//	return service.delete(p);
		
//	}
	
	@DeleteMapping("/deleteId")
	public Modulo deleteId(@RequestBody int id) {
		return service.deleteId(id);
		
	}
	
	

}
