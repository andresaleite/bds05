package com.devsuperior.movieflix.dto;

import java.io.Serializable;

public class ReviewDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private long id;
	private String name;
	public ReviewDTO() {
	}
	
	
	public ReviewDTO(long id, String name) {
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
