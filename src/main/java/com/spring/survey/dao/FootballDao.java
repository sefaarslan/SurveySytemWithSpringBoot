package com.spring.survey.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.survey.models.FootballSurvey;

@Repository
public interface FootballDao extends JpaRepository<FootballSurvey, Integer>{
	

}
