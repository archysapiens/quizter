package archy.soft.quizter.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

import archy.soft.quizter.model.Examen;
import archy.soft.quizter.service.ExamenService;

@RestController
@RequestMapping("/Examen")
public class ControllersExamen {
	
private static Logger log = LoggerFactory.getLogger(ControllerMain.class);
	
	@Autowired
	ExamenService service;
	
	@GetMapping("/listar")
	public List<Examen> listar(){
		return service.listar();
	}
	
	@GetMapping("/listarId/{id}")
	public ResponseEntity<?> listarId(@PathVariable int id) {
		Optional<Examen> op = service.listarId(id);
		if(!op.isPresent()){
			return ResponseEntity.notFound().build();			
		}
		return ResponseEntity.ok(op.get());
		
	}
	
	@PostMapping
    public Examen agregar(@RequestBody Examen p) {
		
		log.info("agregar {} --  {}",p.getResultado());
		return service.add(p);
	}
	
	@PutMapping
	public Examen edit(@RequestBody Examen p) {
		return service.edit(p);
	}
	
	//@DeleteMapping("/delete")
	//public Examen borrar(@RequestBody Examen p) {
	//	return service.delete(p);
	//}
	
	@DeleteMapping("/deleteid")
	public Examen borrarId(@RequestBody int id) {
		return service.deleteId(id);
	}
	
	

}
