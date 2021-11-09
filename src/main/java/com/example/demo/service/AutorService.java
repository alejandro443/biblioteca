package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Autor;
import com.example.demo.repository.AutorRepository;
@Repository
public class AutorService implements SAutor{
	
	@Autowired
	private AutorRepository autorrepository;
	
	
	@Override
	public Autor create(Autor al) {
		// TODO Auto-generated method stub
		return autorrepository.save(al);
	}

	@Override
	public List<Autor> readAll() {
		// TODO Auto-generated method stub
		return autorrepository.findAll();
	}

	@Override
	public Autor read(Long id) {
		// TODO Auto-generated method stub
		return autorrepository.findById(id).get();
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		autorrepository.deleteById(id);
		
	}

	@Override
	public Autor update(Autor al) {
		// TODO Auto-generated method stub
		return autorrepository.save(al);
	}

}
