package com.devsuperior.movieflix.dto;

import java.io.Serializable;

public class GenreDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private long id;
	private String name;
	public GenreDTO() {
	}
	
	
	public GenreDTO(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


}
