package archy.soft.quizter.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import archy.soft.quizter.model.users;
import archy.soft.quizter.service.UsersService;


@RestController
@RequestMapping("/users")
public class ControllerMain {

	private static Logger log = LoggerFactory.getLogger(ControllerMain.class);
	
	@Autowired
	UsersService service;
	
	@GetMapping
	public List<users> listar(){
		return service.listar();
	}
	
	@PostMapping
	public users agregar(@RequestBody users p) {
		
		log.info("agregar {} --  {}",p.getNombre(), p.getApm());
		return service.add(p);
	}

}
