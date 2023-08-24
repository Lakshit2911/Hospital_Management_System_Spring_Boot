package com.example.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "patients")
public class Patient {

    private int id;
    private String name;
    private Date dob;
    private int age;
    private String sex;
    private String address;

	public Patient(int id, int age, String name, Date dob, String sex, String address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.sex = sex;
		this.address = address;
	}

	public Patient() {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "P_name", nullable = false)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "P_sex", nullable = false)
    public String getSex() {
        return sex;
    }
    public void setSex(String lastName) {
        this.sex = sex;
    }
    
    @Column(name = "P_age", nullable = false)
    public String getAge() {
        return sex;
    }
    public void setAge(int age) {
        this.sex = sex;
    }

    @Column(name = "P_dob", nullable = false)
	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Column(name = "P_address", nullable = false)
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
    
}