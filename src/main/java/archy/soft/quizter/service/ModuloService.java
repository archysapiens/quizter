package archy.soft.quizter.service;

import java.util.List;

import com.google.common.base.Optional;

import archy.soft.quizter.model.Modulo;

public interface ModuloService {
	
	List<Modulo> listar();
	Optional<Modulo> listarId(int id);
	//Modulo listarId(int id);
	Modulo add(Modulo p);
	Modulo edit(Modulo p);
	Modulo delete(Modulo p);
	Modulo deleteId(int id);

}
