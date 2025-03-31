package com.example.practice.model;

//Importing required classes
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import org.bson.BsonTimestamp;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//Annotations
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class User {

	@Id
	private Long id;
	private String fname;
	private String lname;
	private BsonTimestamp createdDate = new BsonTimestamp();
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public BsonTimestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(BsonTimestamp createdDate) {
		this.createdDate = createdDate;
	}
	
	

}