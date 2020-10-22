package archy.soft.quizter.service;

import java.util.List;

import com.google.common.base.Optional;

import archy.soft.quizter.model.Preguntas;

public interface PreguntasService {
	
	List<Preguntas> listar();
	Optional<Preguntas> listarId(int id);
	Preguntas add(Preguntas p);
	Preguntas edit(Preguntas p);
	Preguntas delete(Preguntas p);
	Preguntas deleteId(int id);

}
