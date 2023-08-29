package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Bikedetail")
public class BikeModel 
{
	@Id
	private int bikeId;
	private String regnumber;
	private String qwnername;
	private int year;
	private String bikename;
	private String modelname;
	
	public BikeModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BikeModel(int bikeId, String regnumber, String qwnername, int year, String bikename, String modelname) {
		super();
		this.bikeId = bikeId;
		this.regnumber = regnumber;
		this.qwnername = qwnername;
		this.year = year;
		this.bikename = bikename;
		this.modelname = modelname;
	}

	public int getBikeId() {
		return bikeId;
	}

	public void setBikeId(int bikeId) {
		this.bikeId = bikeId;
	}

	public String getRegnumber() {
		return regnumber;
	}

	public void setRegnumber(String regnumber) {
		this.regnumber = regnumber;
	}

	public String getQwnername() {
		return qwnername;
	}

	public void setQwnername(String qwnername) {
		this.qwnername = qwnername;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getBikename() {
		return bikename;
	}

	public void setBikename(String bikename) {
		this.bikename = bikename;
	}

	public String getModelname() {
		return modelname;
	}

	public void setModelname(String modelname) {
		this.modelname = modelname;
	}
	
	
}
