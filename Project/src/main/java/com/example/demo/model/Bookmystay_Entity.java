package com.example.demo.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="BookmyStay")
public class Bookmystay_Entity 
{
	@Id
	private int id;
	private String name;
	private int members;
	private long mobile_no;
	private Date day_in;
	private Date day_out;
	
	public Bookmystay_Entity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bookmystay_Entity(int id, String name, int members, long mobile_no, Date day_in, Date day_out) {
		super();
		this.id = id;
		this.name = name;
		this.members = members;
		this.mobile_no = mobile_no;
		this.day_in = day_in;
		this.day_out = day_out;
	}

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

	public int getMembers() {
		return members;
	}

	public void setMembers(int members) {
		this.members = members;
	}

	public long getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(long mobile_no) {
		this.mobile_no = mobile_no;
	}

	public Date getDay_in() {
		return day_in;
	}

	public void setDay_in(Date day_in) {
		this.day_in = day_in;
	}

	public Date getDay_out() {
		return day_out;
	}

	public void setDay_out(Date day_out) {
		this.day_out = day_out;
	}
	
	
}
