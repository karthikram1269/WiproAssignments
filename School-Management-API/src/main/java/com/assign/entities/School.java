package com.assign.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class School {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String schoolName;
	private String schoolAdress;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "teacher_id")
	private Teacher teachers;

	public School(long id, String schoolName, String schoolAdress, Teacher teachers) {
		super();
		this.id = id;
		this.schoolName = schoolName;
		this.schoolAdress = schoolAdress;
		this.teachers = teachers;
	}

	public School() {
		super();
	}

	@Override
	public String toString() {
		return "School [id=" + id + ", schoolName=" + schoolName + ", schoolAdress=" + schoolAdress + ", teachers="
				+ teachers + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getSchoolAdress() {
		return schoolAdress;
	}

	public void setSchoolAdress(String schoolAdress) {
		this.schoolAdress = schoolAdress;
	}

	public Teacher getTeachers() {
		return teachers;
	}

	public void setTeachers(Teacher teachers) {
		this.teachers = teachers;
	}

}
