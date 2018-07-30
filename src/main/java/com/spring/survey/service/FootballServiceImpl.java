package com.spring.survey.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.survey.dao.FootballDao;
import com.spring.survey.models.FootballSurvey;

@Service
public class FootballServiceImpl implements FootballService{
	
	@Autowired
	private FootballDao footballdao; 

	@Override
	public void save(FootballSurvey fparticipant) {
		footballdao.save(fparticipant);
	}

	@Override
	public List<FootballSurvey> getFootballSurveyList() {
		// TODO Auto-generated method stub
		return footballdao.findAll();
	}

	@Override
	public FootballSurvey findOne(int id) {
		// TODO Auto-generated method stub
		return footballdao.getOne(id);
	}

	@Override
	public void delete(int id) {
		 footballdao.deleteById(id);
		
	}

	
	

}
