package archy.soft.quizter.service;

import java.util.List;

import com.google.common.base.Optional;

import archy.soft.quizter.model.ContactoUsuario;

public interface ContactoUsuarioService {
	
	List<ContactoUsuario> listar();
	Optional<ContactoUsuario> listarId(int id);
	ContactoUsuario add(ContactoUsuario p);
	ContactoUsuario edit(ContactoUsuario p);
	ContactoUsuario delete(ContactoUsuario p);
	ContactoUsuario deleteId(int id);

}
