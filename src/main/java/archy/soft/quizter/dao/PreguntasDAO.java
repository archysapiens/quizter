package archy.soft.quizter.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.google.common.base.Optional;

import archy.soft.quizter.model.Preguntas;


public interface PreguntasDAO extends CrudRepository<Preguntas, Integer> {

	
	List<Preguntas> findAll();
	Optional<Preguntas> findById(int  id);
	@SuppressWarnings("unchecked")
	Preguntas save(Preguntas p);
	void delete(Preguntas p);
	Preguntas deleteById(int p);
}
