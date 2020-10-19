package archy.soft.quizter.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.google.common.base.Optional;

import archy.soft.quizter.model.CatalogoContacto;

public interface CatalogoContactoDAO extends CrudRepository<CatalogoContacto, Integer>{
	
	List<CatalogoContacto> findAll();
	Optional<CatalogoContacto> findById(int  id);
	@SuppressWarnings("unchecked")
	CatalogoContacto save(CatalogoContacto p);
	void delete(CatalogoContacto p);
	CatalogoContacto deleteById(int id);


}
