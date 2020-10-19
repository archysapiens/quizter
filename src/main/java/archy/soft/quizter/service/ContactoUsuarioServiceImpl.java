package archy.soft.quizter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.base.Optional;

import archy.soft.quizter.dao.ContactoUsuarioDAO;
import archy.soft.quizter.model.ContactoUsuario;

@Service
public class ContactoUsuarioServiceImpl implements ContactoUsuarioService{

	@Autowired
	ContactoUsuarioDAO dao;
	@Override
	public List<ContactoUsuario> listar() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Optional<ContactoUsuario> listarId(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
		
	}

	@Override
	public ContactoUsuario add(ContactoUsuario p) {
		// TODO Auto-generated method stub
		return dao.save(p);
	}

	@Override
	public ContactoUsuario edit(ContactoUsuario p) {
		// TODO Auto-generated method stub
		return dao.save(p);
	}

	@Override
	public ContactoUsuario delete(ContactoUsuario p) {
		// TODO Auto-generated method stub
		dao.delete(p);
		return null;
	}

	@Override
	public ContactoUsuario deleteId(int id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
		return null;
	}

	

}
