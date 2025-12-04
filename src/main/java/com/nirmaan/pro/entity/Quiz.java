package com.nirmaan.pro.entity;

import java.util.ArrayList;
import java.util.List;


import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name ="quiz")
public class Quiz {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int qzid;
	
	private String topic;
	
	@OneToMany(mappedBy = "quiz",cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<Question> questions = new ArrayList<>();

	public int getQzid() {
		return qzid;
	}

	public void setQzid(int qzid) {
		this.qzid = qzid;
	}


	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	public Quiz(int qzid, String topic, List<Question> questions) {
		
		this.qzid = qzid;
		this.topic = topic;
		this.questions = questions;
	}

	public Quiz() {
		
	}
	
	
	
	
	
	
	

}
