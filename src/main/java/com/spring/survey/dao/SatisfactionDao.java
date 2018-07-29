package com.spring.survey.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.survey.models.SatisfactionSurvey;


@Repository
public interface SatisfactionDao extends JpaRepository<SatisfactionSurvey, Integer> {

	
	

}
