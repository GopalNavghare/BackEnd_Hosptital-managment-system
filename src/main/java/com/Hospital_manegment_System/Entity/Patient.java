package com.Hospital_manegment_System.Entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="patients")
public class Patient 
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="age")
	private String age;

	
	@Column(name="precreption")
	private String precreption;
	
	@Column(name="dose")
	private String dose;
	
	@Column(name="blood")
	private String blood;
	
	@Column(name="fees")
	private String fees;
	
	@Column(name="argency")
	private String argency;

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


	public String getPrecreption() {
		return precreption;
	}

	public void setPrecreption(String precreption) {
		this.precreption = precreption;
	}

	public String getDose() {
		return dose;
	}

	public void setDose(String dose) {
		this.dose = dose;
	}

	public String getBlood() {
		return blood;
	}

	public void setBlood(String blood) {
		this.blood = blood;
	}

	public String getFees() {
		return fees;
	}

	public void setFees(String fees) {
		this.fees = fees;
	}

	public String getArgency() {
		return argency;
	}

	public void setArgency(String argency) {
		this.argency = argency;
	}
	
	
	 
}
