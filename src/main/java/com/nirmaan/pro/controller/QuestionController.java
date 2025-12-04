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

import com.nirmaan.pro.service.QuestionService;

@RestController
@RequestMapping("QuizApplication")
public class QuestionController {
	
	@Autowired
	public QuestionService qs;
	

	@GetMapping("getAll")
	public List<Question> getAllQuiz(){
		return qs.getAllQueation();
	}
	
	@PostMapping("create")
	public Question postMapping(@RequestBody Question q) {
		return qs.createNewQuestion(q);
	}
	
	@GetMapping("get/{qid}")
	public Question getMapping(@PathVariable int qid) {
		return qs.getExisting(qid);
	}
	
	@PutMapping("update/{qid}")
	public Question putMapping(@PathVariable int qid, @RequestBody Question q) {
		return qs.updateQuestion(qid, q);
	}
	
	@DeleteMapping("delete/{qid}")
	public String deleteMapping(@PathVariable int qid) {
		return qs.deleteQuestion(qid);
	}

}
