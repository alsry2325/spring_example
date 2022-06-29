package com.example.lesson04.model;

import java.util.Date;

public class NewStudent {

				private int		id;
				private String	name;
				private String	phoneNumber;
				private String	email;
				private String	dreamJob;
				private Date	createdAt;
				private Date	updatedAt;
				
				
				public int getId() {
					return id;
				}
				public String getName() {
					return name;
				}
				public String getPhoneNumber() {
					return phoneNumber;
				}
				public String getEmail() {
					return email;
				}
				public String getDreamJob() {
					return dreamJob;
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
				public void setPhoneNumber(String phoneNumber) {
					this.phoneNumber = phoneNumber;
				}
				public void setEmail(String email) {
					this.email = email;
				}
				public void setDreamJob(String dreamJob) {
					this.dreamJob = dreamJob;
				}
				public void setCreatedAt(Date createdAt) {
					this.createdAt = createdAt;
				}
				public void setUpdatedAt(Date updatedAt) {
					this.updatedAt = updatedAt;
				}
					
				
				
}
