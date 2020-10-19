package archy.soft.quizter.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.google.common.base.Optional;

import archy.soft.quizter.model.Cat_contac;

public interface Cat_contacDAO extends CrudRepository<Cat_contac, Integer>{
	
	List<Cat_contac> findAll();
	Optional<Cat_contac> findById(int id);
	@SuppressWarnings("unchecked")
	Cat_contac save(Cat_contac p);
	void delete(Cat_contac p);
	Cat_contac deleteById(int id);

}
