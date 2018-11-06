package com.agilecrm.model;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Contact {
	
		private int id;
		private String firstName;
		private String lastName;
		private String email;
		private String createdBy;
		private String createdDate;
		private String address;
		private String dob;
		private boolean isActive;
		private String updatedBy;
		private String updatedDate;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getCreatedBy() {
			return createdBy;
		}
		public void setCreatedBy(String createdBy) {
			this.createdBy = createdBy;
		}
		public String getCreatedDate() {
			return createdDate;
		}
		//public void setCreatedDate(String createdDate) throws ParseException {
			//this.createdDate = new SimpleDateFormat("dd/MM/yyyy").parse(createdDate);
		public void setCreatedDate(String createdDate) {
			this.createdDate =createdDate;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getDob() {
			return dob;
		}
		public void setDob(String dob) {
			this.dob = dob;
		}
		public boolean isActive() {
			return isActive;
		}
		public void setActive(boolean isActive) {
			this.isActive = isActive;
		}
		public String getUpdatedBy() {
			return updatedBy;
		}
		public void setUpdatedBy(String updatedBy) {
			this.updatedBy = updatedBy;
		}
		public String getUpdatedDate() {
			return updatedDate;
		}
		public void setUpdatedDate(String updatedDate) {
			this.updatedDate = updatedDate;
		}		}
		