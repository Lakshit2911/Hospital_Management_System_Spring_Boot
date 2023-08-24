package com.example.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "doctors")
public class Doctor {

    private int id;
    private String Name;
    private String Qualification;
    private String Sex;
    private Date DOB;
    private int P_id;
    
    public Doctor() {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "D_name", nullable = false)
    public String getName() {
        return Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }

    @Column(name = "D_qualification", nullable = false)
	public String getQualification() {
		return Qualification;
	}

	public void setQualification(String qualification) {
		Qualification = qualification;
	}

	@Column(name = "D_sex", nullable = false)
	public String getSex() {
		return Sex;
	}

	public void setSex(String sex) {
		Sex = sex;
	}
	
	@Column(name = "D_dob", nullable = false)
	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}

	@Column(name = "P_Id", nullable = false)
	public int getP_id() {
		return P_id;
	}

	public void setP_id(int p_id) {
		P_id = p_id;
	}

	public Doctor(int id, String name, String qualification, String sex, Date dOB, int p_id) {
		super();
		this.id = id;
		Name = name;
		Qualification = qualification;
		Sex = sex;
		DOB = dOB;
		P_id = p_id;
	}
    
}