package archy.soft.quizter.service;

import java.util.List;

import com.google.common.base.Optional;

import archy.soft.quizter.model.Cat_contac;


public interface Cat_contacService {
	
	List<Cat_contac> listar();
	Optional<Cat_contac> listarId(int id);
	Cat_contac add(Cat_contac p);
	Cat_contac edit(Cat_contac p);
	Cat_contac delete(Cat_contac p);
	Cat_contac deleteId(int id);

}
