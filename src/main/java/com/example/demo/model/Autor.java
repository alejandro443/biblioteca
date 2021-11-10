package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="autores")
public class Autor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idautor;
	@Column(name="nombres")
	private String nombres;
	@Column(name="apellidos")
	private String apellidos;
	@OneToMany(cascade =CascadeType.MERGE , mappedBy ="autor",fetch=FetchType.LAZY)
	@JsonIgnore
	private List<Libro> libros=new ArrayList<>();
	
	
	
	
	
}
