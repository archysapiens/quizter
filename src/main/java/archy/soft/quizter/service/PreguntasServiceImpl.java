package archy.soft.quizter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.base.Optional;

import archy.soft.quizter.dao.PreguntasDAO;
import archy.soft.quizter.model.Preguntas;

@Service
public class PreguntasServiceImpl implements PreguntasService {

	@Autowired
	private PreguntasDAO dao;
	@Override
	public List<Preguntas> listar() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Optional<Preguntas> listarId(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	@Override
	public Preguntas add(Preguntas p) {
		// TODO Auto-generated method stub
		return dao.save(p);
	}

	@Override
	public Preguntas edit(Preguntas p) {
		// TODO Auto-generated method stub
		return dao.save(p);
	}

	@Override
	public Preguntas delete(Preguntas p) {
		// TODO Auto-generated method stub
		dao.delete(p);
		return null;
	}	
	public Preguntas deleteId(int id) {
		dao.deleteById(id);
		return null;
	}

}
