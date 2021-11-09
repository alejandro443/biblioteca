package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Autor;


public interface SAutor {
	Autor create(Autor al);
	List<Autor> readAll();
	Autor read(Long id);
	void delete(Long id);
	Autor update(Autor al);
}
