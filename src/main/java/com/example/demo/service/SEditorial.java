package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Editorial;



public interface SEditorial {
	Editorial create(Editorial al);
	List<Editorial> readAll();
	Editorial read(Long id);
	void delete(Long id);
	Editorial update(Editorial al);
}
