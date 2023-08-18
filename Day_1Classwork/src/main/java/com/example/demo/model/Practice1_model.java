package com.example.demo.model;

public class Practice1_model 
{
	private String studentName;
	private String message;
	
	public Practice1_model() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Practice1_model(String studentName, String message) {
		super();
		this.studentName = studentName;
		this.message = message;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}
