package com.example.demo.model;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Bookmystay")
public class Bookmystay_Entity 
{
	@Id
	private int id;
	private String name;
	private int members;
	private int numberOfRoom;
	private long mobileNo;
	private Date dayIn;
	private Date dayOut;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="userdetail")
	private User_Entity addd;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="hotaldetail")
	private List<Hotal_Entity> add;

	public Bookmystay_Entity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bookmystay_Entity(int id, String name, int members, int numberOfRoom, long mobileNo, Date dayIn, Date dayOut,
			User_Entity addd, List<Hotal_Entity> add) {
		super();
		this.id = id;
		this.name = name;
		this.members = members;
		this.numberOfRoom = numberOfRoom;
		this.mobileNo = mobileNo;
		this.dayIn = dayIn;
		this.dayOut = dayOut;
		this.addd = addd;
		this.add = add;
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

	public int getNumberOfRoom() {
		return numberOfRoom;
	}

	public void setNumberOfRoom(int numberOfRoom) {
		this.numberOfRoom = numberOfRoom;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Date getDayIn() {
		return dayIn;
	}

	public void setDayIn(Date dayIn) {
		this.dayIn = dayIn;
	}

	public Date getDayOut() {
		return dayOut;
	}

	public void setDayOut(Date dayOut) {
		this.dayOut = dayOut;
	}

	public User_Entity getAddd() {
		return addd;
	}

	public void setAddd(User_Entity addd) {
		this.addd = addd;
	}

	public List<Hotal_Entity> getAdd() {
		return add;
	}

	public void setAdd(List<Hotal_Entity> add) {
		this.add = add;
	}

	
	
}
