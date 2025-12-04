package com.nirmaan.pro.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb1_option")
public class Option {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer oid;

	private String otext;

	private boolean correct;

	@ManyToOne
	@JsonBackReference
	private Question question;

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public String getOtext() {
		return otext;
	}

	public void setOtext(String otext) {
		this.otext = otext;
	}

	public boolean isCorrect() {
		return correct;
	}

	public void setCorrect(boolean correct) {
		this.correct = correct;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public Option(int oid, String otext, boolean correct, Question question) {

		this.oid = oid;
		this.otext = otext;
		this.correct = correct;
		this.question = question;
	}

	public Option() {

	}
}
