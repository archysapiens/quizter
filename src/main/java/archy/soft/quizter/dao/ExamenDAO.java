package archy.soft.quizter.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.google.common.base.Optional;

import archy.soft.quizter.model.Examen;


public interface ExamenDAO extends CrudRepository<Examen, Integer> {
	
	List<Examen> findAll();
	Optional<Examen> findById(int  id);
	@SuppressWarnings("unchecked")
	Examen save(Examen p);
	void delete(Examen p);
	Examen deleteById(int id);
}
