package archy.soft.quizter.service;

import java.util.List;

import com.google.common.base.Optional;

import archy.soft.quizter.model.Examen;

public interface ExamenService {

	List<Examen> listar();
	Optional<Examen> listarId(int id);
	Examen add(Examen p);
	Examen edit(Examen p);
	Examen delete(Examen p);
	Examen deleteId(int id);
}
