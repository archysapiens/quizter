package archy.soft.quizter.service;

import java.util.List;

import com.google.common.base.Optional;

import archy.soft.quizter.model.CatalogoContacto;

public interface CatalogoContactoService {
	
	List<CatalogoContacto> listar();
	Optional<CatalogoContacto> listarId(int id);
	CatalogoContacto add(CatalogoContacto p);
	CatalogoContacto edit(CatalogoContacto p);
	CatalogoContacto delete(CatalogoContacto p);
	CatalogoContacto deleteId(int id);

}
