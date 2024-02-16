package com.web.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StudentEntity {
	@Id
	private int studentRollNumber;
	private String studentName;
	private String course;
	private int hibernateMarks;
	private int springMarks;
	private int springBootMarks;
	private int totalMarks;
	private float percentage;
	private String grade;
	private String result;
	public StudentEntity() {
		super();
	}
	public int getStudentRollNumber() {
		return studentRollNumber;
	}
	public void setStudentRollNumber(int studentRollNumber) {
		this.studentRollNumber = studentRollNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getHibernateMarks() {
		return hibernateMarks;
	}
	public void setHibernateMarks(int hibernateMarks) {
		this.hibernateMarks = hibernateMarks;
	}
	public int getSpringMarks() {
		return springMarks;
	}
	public void setSpringMarks(int springMarks) {
		this.springMarks = springMarks;
	}
	public int getSpringBootMarks() {
		return springBootMarks;
	}
	public void setSpringBootMarks(int springBootMarks) {
		this.springBootMarks = springBootMarks;
	}
	public int getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "StudentEntity [studentRollNumber=" + studentRollNumber + ", studentName=" + studentName + ", course="
				+ course + ", hibernateMarks=" + hibernateMarks + ", springMarks=" + springMarks + ", springBootMarks="
				+ springBootMarks + ", totalMarks=" + totalMarks + ", percentage=" + percentage + ", grade=" + grade
				+ ", result=" + result + "]";
	}
	
	

}


