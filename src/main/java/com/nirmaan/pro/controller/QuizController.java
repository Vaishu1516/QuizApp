package com.nirmaan.pro.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nirmaan.pro.entity.Question;
import com.nirmaan.pro.entity.Quiz;
import com.nirmaan.pro.repository.QuizRepo;
import com.nirmaan.pro.service.QuizService;

@RestController
@RequestMapping("QuizApp")
public class QuizController {

	@Autowired
	public QuizService qzs;
	
	@Autowired
	public QuizRepo qzr;
	
	@GetMapping("getAll")
	public List<Quiz> getAllQuiz(){
		return qzs.getAllQuiz();
	}

	@PostMapping("create")
	public Quiz postMapping(@RequestBody Quiz q) {
		return qzs.createNewQuiz(q);
	}

	@GetMapping("getqz/{qzid}")
	public Quiz getMapping(@PathVariable int qzid) {
		return qzs.getExistingQuiz(qzid);
	}

	@PutMapping("updateqz/{qzid}")
	public Quiz putMapping(@PathVariable int qzid, Quiz q) {
		return qzs.updateQuiz(qzid, q);
	}

	@DeleteMapping("deleteqz/{qzid}")
	public List<Question> deleteMapping(@PathVariable int qzid) {
		return qzs.deleteQuiz(qzid);
	}

}
