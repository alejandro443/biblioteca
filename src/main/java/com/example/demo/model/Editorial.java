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
@Table(name="editoriales")
public class Editorial {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ideditorial;
	@Column(name="editorial")
	private String editorial;
	
	@OneToMany(cascade =CascadeType.MERGE , mappedBy ="editorial",fetch=FetchType.LAZY)
	@JsonIgnore
	private List<Libro> libros=new ArrayList<>();
	
	
	
	
}
