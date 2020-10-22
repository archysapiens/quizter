package archy.soft.quizter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.base.Optional;

import archy.soft.quizter.dao.ExamenDAO;
import archy.soft.quizter.model.Examen;

@Service
public class ExamenServiceImpl implements ExamenService {

	@Autowired
	private ExamenDAO dao;
	
	@Override
	public List<Examen> listar() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Optional<Examen> listarId(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	@Override
	public Examen add(Examen p) {
		// TODO Auto-generated method stub
		return dao.save(p);
	}

	@Override
	public Examen edit(Examen p) {
		// TODO Auto-generated method stub
		return dao.save(p);
	}

	@Override
	public Examen delete(Examen p) {
		// TODO Auto-generated method stub
		dao.delete(p);
		return null;
	}
	
	public Examen deleteId(int id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
		return null;
	}
	

}
