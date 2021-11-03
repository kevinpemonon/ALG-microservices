package com.hotel.roomManagement.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Room {
	
	@Id
	private int id;
	
	private String description;
	
	private int area;
	
	private String category;
	
	private int price;

	private String status;

	
	public Room() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Room(int id, String description, int area, String category, int price, String status) {
		super();
		this.id = id;
		this.description = description;
		this.area = area;
		this.category = category;
		this.price = price;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
