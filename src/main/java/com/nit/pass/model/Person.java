package com.nit.pass.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Person_PassPort_App")
public class Person {
	
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "book_ide")
    @GenericGenerator(
        name = "book_ide", 
        strategy = "com.nit.pass.id.CustomIdGen")
	@Column(name="Personid")
	private String personId;
	@Column(name="Person_FNAME",length = 15)
	private String firstName;
	@Column(name="Person_LASTNAME",length = 15)
	private String lastName;
	@Column(name="Person_SURNAME",length = 15)
	private String surName;
	@Column(name="Person_DOB")
	@Temporal(TemporalType.DATE)
	private Date dob;
	@Column(name="Person_CITYNAME",length = 20)
	private String cityName;
	@Transient
	public String date;
	@Column(name="Person_BirthCert",length=20)
	public  String bcert;
	
}
