package com.assign.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String teacherName;
    private String teacherAdress;

    @Enumerated(EnumType.STRING)
    private Qualification qualification;

    private int age;
    private Date dob;
    private int experience;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getTeacherAdress() {
		return teacherAdress;
	}
	public void setTeacherAdress(String teacherAdress) {
		this.teacherAdress = teacherAdress;
	}
	public Qualification getQualification() {
		return qualification;
	}
	public void setQualification(Qualification qualification) {
		this.qualification = qualification;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public Teacher(long id, String teacherName, String teacherAdress, Qualification qualification, int age, Date dob,
			int experience) {
		super();
		this.id = id;
		this.teacherName = teacherName;
		this.teacherAdress = teacherAdress;
		this.qualification = qualification;
		this.age = age;
		this.dob = dob;
		this.experience = experience;
	}
	public Teacher() {
		super();
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", teacherName=" + teacherName + ", teacherAdress=" + teacherAdress
				+ ", qualification=" + qualification + ", age=" + age + ", dob=" + dob + ", experience=" + experience
				+ "]";
	}

    
    
}
