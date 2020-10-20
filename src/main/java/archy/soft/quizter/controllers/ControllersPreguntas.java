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

import archy.soft.quizter.model.Preguntas;
import archy.soft.quizter.service.PreguntasService;

@RestController
@RequestMapping("/Preguntas")
public class ControllersPreguntas {
	
	private static Logger log = LoggerFactory.getLogger(ControllerMain.class);
	
	@Autowired
	PreguntasService service;
	
	@GetMapping("/listar")
	public List<Preguntas> listar(){
		return service.listar();
	}
	
	@GetMapping("/listarId/{id}")
	public ResponseEntity<Preguntas> listarId(@PathVariable int id){
		Optional<Preguntas> op= service.listarId(id);
		if(!op.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(op.get());
	}
	
	
	@PostMapping
    public Preguntas agregar(@RequestBody Preguntas p) {
		
		log.info("agregar {} --  {}",p.getPregunta());
		return service.add(p);
	}
	
	@PutMapping
	public Preguntas edit(@RequestBody Preguntas p) {
		return service.edit(p);
	}
	
	//@DeleteMapping("/delete")
	//public Preguntas delete(@RequestBody Preguntas p) {
	//	return service.delete(p);
	//}
	
	@DeleteMapping("/deleteId")
	public Preguntas deleteId(@RequestBody int id) {
		return service.deleteId(id);
	}
	

}
