package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Libro;
import com.example.demo.repository.LibroRepository;
@Repository
public class LibroService implements SLibro{
	@Autowired
	private LibroRepository librorepository;
	
	@Override
	public Libro create(Libro al) {
		// TODO Auto-generated method stub
		return librorepository.save(al);
	}

	@Override
	public List<Libro> readAll() {
		// TODO Auto-generated method stub
		return librorepository.findAll();
	}

	@Override
	public Libro read(Long id) {
		// TODO Auto-generated method stub
		return librorepository.findById(id).get();
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		librorepository.deleteById(id);
	}

	@Override
	public Libro update(Libro al) {
		// TODO Auto-generated method stub
		return librorepository.save(al);
	}

}
