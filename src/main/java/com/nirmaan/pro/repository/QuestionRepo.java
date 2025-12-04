package com.nirmaan.pro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nirmaan.pro.entity.Question;

@Repository
public interface QuestionRepo extends JpaRepository<Question, Integer> {

}
