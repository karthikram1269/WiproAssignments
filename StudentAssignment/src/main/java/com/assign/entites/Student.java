package com.assign.entites;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rollno;

    private String name;
    private String fatherName;

    public enum Gender {
        MALE, FEMALE, OTHERS
    }

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private Date dob;
    private String address;

    public Student() {
        super();
    }

    public Student(int rollno, String name, String fatherName, Gender gender, Date dob, String address) {
        super();
        this.rollno = rollno;
        this.name = name;
        this.fatherName = fatherName;
        this.gender = gender;
        this.dob = dob;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student [rollno=" + rollno + ", name=" + name + ", fatherName=" + fatherName +
               ", gender=" + gender + ", dob=" + dob + ", address=" + address + "]";
    }

    // Getters and setters
    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
