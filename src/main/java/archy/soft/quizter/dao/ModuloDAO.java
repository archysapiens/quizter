package archy.soft.quizter.dao;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import com.google.common.base.Optional;

import archy.soft.quizter.model.Modulo;

public interface ModuloDAO extends CrudRepository<Modulo, Integer> {

	
	List<Modulo> findAll();
	Optional<Modulo> findById(int id);
	//Modulo findById(int id);
	@SuppressWarnings("unchecked")
	Modulo save(Modulo p);
	void delete(Modulo p);
	Modulo deleteById(int id);
}
