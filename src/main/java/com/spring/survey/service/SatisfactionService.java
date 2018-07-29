package com.spring.survey.service;

import java.util.List;

import com.spring.survey.models.SatisfactionSurvey;

public interface SatisfactionService {
	
	void save(SatisfactionSurvey sparticipant);
	List<SatisfactionSurvey> getSatisfactionSurveyList();

}
