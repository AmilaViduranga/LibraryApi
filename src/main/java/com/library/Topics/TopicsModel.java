package com.library.Topics;

import javax.persistence.*;

@Entity
@Table(name="topics_details")
public class TopicsModel {
	
	@Id @GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "description")
	private String description;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public TopicsModel() {
		
	}
	
	public TopicsModel(int id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}
}
