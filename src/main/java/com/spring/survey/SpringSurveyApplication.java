package com.spring.survey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.spring.survey.dao.FootballDao;

@SpringBootApplication
@EnableJpaRepositories("com.spring.survey.dao") 
public class SpringSurveyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSurveyApplication.class, args);
	}
}
