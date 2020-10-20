package archy.soft.quizter.service;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.base.Optional;

import archy.soft.quizter.dao.ModuloDAO;
import archy.soft.quizter.model.Modulo;

@Service
public class ModuloServiceImpl implements ModuloService {
	
	@Autowired
	private ModuloDAO dao;

	@Override
	public List<Modulo> listar() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Optional<Modulo> listarId(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	@Override
	public Modulo add(Modulo p) {
		// TODO Auto-generated method stub
		return dao.save(p);
	}

	@Override
	public Modulo edit(Modulo p) {
		// TODO Auto-generated method stub
		return dao.save(p);
	}

	@Override
	public Modulo delete(Modulo p) {
		// TODO Auto-generated method stub
		 dao.delete(p);
		 return null;
	}
	@Override
	public Modulo deleteId(int id) {
		// TODO Auto-generated method stub
		 dao.deleteById(id);
		 return null;
	}
	

}
