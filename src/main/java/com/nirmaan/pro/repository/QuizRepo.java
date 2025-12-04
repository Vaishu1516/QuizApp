package com.nirmaan.pro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nirmaan.pro.entity.Quiz;

@Repository
public interface QuizRepo extends JpaRepository<Quiz, Integer> {

}
