package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="libros")
public class Libro {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idlibro;
	@Column(name="titulo")
	private String titulo;
	@Column(name="paginas")
	private int paginas;
	@Column(name="descripcion")
	private String descripcion;
	public Libro() {
		super();
	}
	
	public Libro(long idlibro, String titulo, int paginas, String descripcion) {
		super();
		this.idlibro = idlibro;
		this.titulo = titulo;
		this.paginas = paginas;
		this.descripcion = descripcion;
	}

	public long getIdlibro() {
		return idlibro;
	}
	public void setIdlibro(long idlibro) {
		this.idlibro = idlibro;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	

}
