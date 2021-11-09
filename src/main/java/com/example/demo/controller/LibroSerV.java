package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Libro;

import com.example.demo.service.LibroService;

@RestController
@RequestMapping("/api")
public class LibroSerV {
	@Autowired
	private LibroService libroservice;
	@PostMapping("/alumno")
	public ResponseEntity<Libro> save(@RequestBody Libro alum){
		try {
			Libro al = libroservice.create(new Libro(alum.getIdlibro(),alum.getTitulo(),alum.getPaginas(),alum.getDescripcion()));
			
			return new ResponseEntity<>(al, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	//----------------------------------------------------------------------------------------
	@GetMapping("/alumnos")
	public ResponseEntity<List<Libro>> getAlumnos(){
		try {
			List<Libro> list = new ArrayList<>();
			list = libroservice.readAll();
			if(list.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(list, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	//---------------------------------------------------------------------------------------------
	@PutMapping("/update/{id}")
	public ResponseEntity<Libro> update(@RequestBody Libro alum, @PathVariable("id") long id){
		try {
			Libro ul = libroservice.read(id);
			if(ul.getIdlibro()>0) {
				ul.setTitulo(alum.getTitulo());
				ul.setPaginas(alum.getPaginas());
				ul.setDescripcion(alum.getDescripcion());
				
				
				return new ResponseEntity<>(libroservice.create(ul),HttpStatus.OK);
			}else {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}			

		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	//---------------------------------------------------------------------------------
	@DeleteMapping("delete/{id}")
	public ResponseEntity<HttpStatus> delete(@PathVariable("id") long id){
		try {
			libroservice.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	

}
