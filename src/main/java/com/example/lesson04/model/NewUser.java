package com.example.lesson04.model;

import java.util.Date;

public class NewUser {

	private int id;
	private String name;
	private String yyyymmdd;
	private String email;
	private String introduce;
	private Date createdAt;
	private Date updatedAt;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getYyyymmdd() {
		return yyyymmdd;
	}

	public String getEmail() {
		return email;
	}

	public String getIntroduce() {
		return introduce;
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

	public void setName(String name) {
		this.name = name;
	}

	public void setYyyymmdd(String yyyymmdd) {
		this.yyyymmdd = yyyymmdd;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

}
