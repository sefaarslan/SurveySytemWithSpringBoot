package com.spring.survey.service;

import java.util.List;

import com.spring.survey.models.FootballSurvey;


public interface FootballService {

	void save(FootballSurvey fparticipant);
	List<FootballSurvey> getFootballSurveyList();
}
