package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="editoriales")
public class Editorial {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long ideditorial;
	@Column(name="editorial")
	private String editorial;
	public Editorial() {
		super();
	}
	
	
	public Editorial(long ideditorial, String editorial) {
		super();
		this.ideditorial = ideditorial;
		this.editorial = editorial;
	}


	public long getIdeditorial() {
		return ideditorial;
	}
	public void setIdeditorial(long ideditorial) {
		this.ideditorial = ideditorial;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	
}
