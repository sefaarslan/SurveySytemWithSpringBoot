package com.spring.survey.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.survey.dao.SatisfactionDao;
import com.spring.survey.models.SatisfactionSurvey;

@Service
public class SatisfactionServiceImpl implements	SatisfactionService {
	
	@Autowired
	private SatisfactionDao satisfactiondao;

	@Override
	public void save(SatisfactionSurvey sparticipant) {
		satisfactiondao.save(sparticipant);
	}

	@Override
	public List<SatisfactionSurvey> getSatisfactionSurveyList() {
		// TODO Auto-generated method stub
		return satisfactiondao.findAll();
	}

	



}
