package com.result.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Result {
public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getRollno() {
		return rollno;
	}
	public void setRollno(Long rollno) {
		this.rollno = rollno;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public Double getScore() {
		return score;
	}
	public Result(String name, Long rollno, LocalDate dob, Double score) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.dob = dob;
		this.score = score;
	}
	public Result() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setScore(Double score) {
		this.score = score;
	}
private String name;
	
	
	@Id
	private Long rollno;
	private LocalDate dob;
	private Double score;
}
