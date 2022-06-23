package com.example.leeson02.model;

import java.util.Date;

public class UsedGoods {

	
	private int	id; 
	private String	title; 
	private	int price; 
	private String	description; 
	private String	picture; 
	private int	sellerId; 
	private Date createdAt; 
	
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public int getPrice() {
		return price;
	}
	public String getDescription() {
		return description;
	}
	public String getPicture() {
		return picture;
	}
	public int getSellerId() {
		return sellerId;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	private Date updatedAt; 
}
