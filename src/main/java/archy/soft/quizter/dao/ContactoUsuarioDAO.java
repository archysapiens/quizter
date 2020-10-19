package archy.soft.quizter.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.google.common.base.Optional;

import archy.soft.quizter.model.ContactoUsuario;

public interface ContactoUsuarioDAO extends CrudRepository<ContactoUsuario, Integer>{
	
	List<ContactoUsuario> findAll();
	Optional<ContactoUsuario> findById(int  id);
	@SuppressWarnings("unchecked")
	ContactoUsuario save(ContactoUsuario p);
	void delete(ContactoUsuario p);
	ContactoUsuario deleteById(int id);


}
