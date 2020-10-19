package archy.soft.quizter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.base.Optional;

import archy.soft.quizter.dao.Cat_contacDAO;
import archy.soft.quizter.model.Cat_contac;

@Service
public class Cat_contacServiceImpl implements Cat_contacService{

	@Autowired
	Cat_contacDAO dao;
	@Override
	public List<Cat_contac> listar() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Optional<Cat_contac> listarId(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	@Override
	public Cat_contac add(Cat_contac p) {
		// TODO Auto-generated method stub
		return dao.save(p);
	}

	@Override
	public Cat_contac edit(Cat_contac p) {
		// TODO Auto-generated method stub
		return dao.save(p);
	}

	@Override
	public Cat_contac delete(Cat_contac p) {
		// TODO Auto-generated method stub
		dao.delete(p);
		return null;
	}

	@Override
	public Cat_contac deleteId(int id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
		return null;
	}

}
