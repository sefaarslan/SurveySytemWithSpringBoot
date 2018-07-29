package com.spring.survey.models;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "football_survey")
public class FootballSurvey {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "surname")
	private String surname;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "birthdate")
	private Date birthdate;
	
	@Column(name = "team")
	private String team;
	
	@Column(name = "explanation")
	private String explanation;
	
	@Column(name = "pollster_name")
	private String pollster_name;
	
	@Column(name = "pollster_surname")
	private String pollster_surname;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getExplanation() {
		return explanation;
	}
	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}
	public String getPollster_name() {
		return pollster_name;
	}
	public void setPollster_name(String pollster_name) {
		this.pollster_name = pollster_name;
	}
	public String getPollster_surname() {
		return pollster_surname;
	}
	public void setPollster_surname(String pollster_surname) {
		this.pollster_surname = pollster_surname;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	

	

}
