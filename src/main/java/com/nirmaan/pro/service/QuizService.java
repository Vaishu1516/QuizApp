package com.nirmaan.pro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nirmaan.pro.entity.Question;
import com.nirmaan.pro.entity.Quiz;

import com.nirmaan.pro.repository.QuizRepo;

@Service
public class QuizService {

	@Autowired
	public QuizRepo qzr;
	
	public List<Quiz> getAllQuiz(){
		return qzr.findAll();
	}

	public Quiz createNewQuiz(Quiz q) {
		return qzr.save(q);
	}

	public Quiz getExistingQuiz(int qzid) {
		return qzr.findById(qzid).get();
	}

	public Quiz updateQuiz(int qzid, Quiz updatedata) {
		Quiz olddata = getExistingQuiz(qzid);
		olddata.setQuestions(updatedata.getQuestions());
		return qzr.save(olddata);
	}

	public List<Question> deleteQuiz(int qzid) {
		Quiz e = getExistingQuiz(qzid);
		qzr.deleteById(qzid);
		return e.getQuestions();
	}

}
