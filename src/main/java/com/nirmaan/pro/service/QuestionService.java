package com.nirmaan.pro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nirmaan.pro.entity.Question;

import com.nirmaan.pro.repository.QuestionRepo;

@Service
public class QuestionService {

	@Autowired
	public QuestionRepo qr;

	public List<Question> getAllQueation() {
		return qr.findAll();
	}

	public Question createNewQuestion(Question q) {
		return qr.save(q);
	}

	public Question getExisting(int qid) {
		return qr.findById(qid).get();
	}

	public Question updateQuestion(int qid, Question updatedata) {
		Question olddata = getExisting(qid);
		olddata.setQtext(updatedata.getQtext());
		return qr.save(olddata);
	}

	public String deleteQuestion(int qid) {
		Question e = getExisting(qid);
		qr.deleteById(qid);
		return e.getQtext();
	}

}
