package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="autores")
public class Autor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idautor;
	@Column(name="nombres")
	private String nombres;
	@Column(name="apellidos")
	private String apellidos;
	public Autor() {
		super();
	}
	
	public Autor(long idautor, String nombres, String apellidos) {
		super();
		this.idautor = idautor;
		this.nombres = nombres;
		this.apellidos = apellidos;
	}

	public long getIdautor() {
		return idautor;
	}
	public void setIdautor(long idautor) {
		this.idautor = idautor;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
}
