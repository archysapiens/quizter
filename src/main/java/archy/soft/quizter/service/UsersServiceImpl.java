package archy.soft.quizter.service;
  
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import archy.soft.quizter.dao.UsersDAO;
import archy.soft.quizter.model.users;

@Service
public class UsersServiceImpl implements UsersService{

	@Autowired
	private UsersDAO dao;

	
	@Override
	public List<users> listar() {
		// TODO Auto-generated method stub
		List<users> list = new ArrayList<>();
		dao.findAll().forEach(e -> list.add(e));
		//return dao.findAll();
		return list;
	}

	@Override
	public users listarId(int id) {
		// TODO Auto-generated method stub
		users obj = dao.findById(id);
		return obj;
	}

	@Override
	public users add(users p) {
		// TODO Auto-generated method stub
		return  dao.save(p);
	}

	@Override
	public users edit(users p) {
		// TODO Auto-generated method stub
		return dao.save(p);
	}

	@Override
	public void delete(int id) {
		dao.delete(listarId(id));
	}
	
	

}
