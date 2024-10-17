package com.Hospital_manegment_System.DoctorLogin.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="appointments")
public class Appointment 
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String name;
	
	private String age;
	
	private String symtomes;
	
	private String number;

	public Appointment(long id, String name, String age, String symtomes, String number) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.symtomes = symtomes;
		this.number = number;
	}
	public Appointment() {
		super();
		
	}
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSymtomes() {
		return symtomes;
	}

	public void setSymtomes(String symtomes) {
		this.symtomes = symtomes;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	
}
