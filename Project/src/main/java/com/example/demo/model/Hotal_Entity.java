package com.example.demo.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="hotel")
public class Hotal_Entity 
{
	@Id
	private int hotalId;
	private String hotalName;
	private String hotalQuality;
	private String hotalAddress;
	private String hotalMailId;
	private long rent;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="hotal_id")
	private List<Bookmystay_Entity> add;
	
	public Hotal_Entity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hotal_Entity(int hotalId, String hotalName, String hotalQuality, String hotalAddress, String hotalMailId,
			long rent, List<Bookmystay_Entity> add) {
		super();
		this.hotalId = hotalId;
		this.hotalName = hotalName;
		this.hotalQuality = hotalQuality;
		this.hotalAddress = hotalAddress;
		this.hotalMailId = hotalMailId;
		this.rent = rent;
		this.add = add;
	}

	public int getHotalId() {
		return hotalId;
	}

	public void setHotalId(int hotalId) {
		this.hotalId = hotalId;
	}

	public String getHotalName() {
		return hotalName;
	}

	public void setHotalName(String hotalName) {
		this.hotalName = hotalName;
	}

	public String getHotalQuality() {
		return hotalQuality;
	}

	public void setHotalQuality(String hotalQuality) {
		this.hotalQuality = hotalQuality;
	}

	public String getHotalAddress() {
		return hotalAddress;
	}

	public void setHotalAddress(String hotalAddress) {
		this.hotalAddress = hotalAddress;
	}

	public String getHotalMailId() {
		return hotalMailId;
	}

	public void setHotalMailId(String hotalMailId) {
		this.hotalMailId = hotalMailId;
	}

	public long getRent() {
		return rent;
	}

	public void setRent(long rent) {
		this.rent = rent;
	}

	public List<Bookmystay_Entity> getAdd() {
		return add;
	}

	public void setAdd(List<Bookmystay_Entity> add) {
		this.add = add;
	}

	
	
	
}
