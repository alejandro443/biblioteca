package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Libro;


public interface SLibro {
	Libro create(Libro al);
	List<Libro> readAll();
	Libro read(Long id);
	void delete(Long id);
	Libro update(Libro al);

}
