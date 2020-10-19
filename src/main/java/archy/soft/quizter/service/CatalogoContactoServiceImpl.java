package archy.soft.quizter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.base.Optional;

import archy.soft.quizter.dao.CatalogoContactoDAO;
import archy.soft.quizter.model.CatalogoContacto;

@Service
public class CatalogoContactoServiceImpl implements CatalogoContactoService{

	@Autowired
	CatalogoContactoDAO dao;
	@Override
	public List<CatalogoContacto> listar() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Optional<CatalogoContacto> listarId(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	@Override
	public CatalogoContacto add(CatalogoContacto p) {
		// TODO Auto-generated method stub
		return dao.save(p);
	}

	@Override
	public CatalogoContacto edit(CatalogoContacto p) {
		// TODO Auto-generated method stub
		return dao.save(p);
	}

	@Override
	public CatalogoContacto delete(CatalogoContacto p) {
		// TODO Auto-generated method stub
		dao.delete(p);
		return null;
	}

	@Override
	public CatalogoContacto deleteId(int id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
		return null;
	}

}
