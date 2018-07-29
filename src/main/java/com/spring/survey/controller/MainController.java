package com.spring.survey.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.survey.models.FootballSurvey;
import com.spring.survey.models.SatisfactionSurvey;
import com.spring.survey.service.FootballService;

import com.spring.survey.service.SatisfactionService;


@Controller
public class MainController {
	
	@Autowired
	private FootballService fservice;
	
	@Autowired
	private SatisfactionService sservice;
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home() {

		return "home";
	}
	
	 @RequestMapping(value = "footballresults", method = RequestMethod.GET)
		public String inde(Model model) {
			List<FootballSurvey> footballsurvey = fservice.getFootballSurveyList();
			model.addAttribute("allfootballsurvey", footballsurvey);

			return "footballresults";
		}
	 @RequestMapping(value = "satisfactionresults", method = RequestMethod.GET)
		public String index(Model model) {
			List<SatisfactionSurvey> satisfactionsurvey = sservice.getSatisfactionSurveyList();
			model.addAttribute("allsatisfactionsurvey", satisfactionsurvey);
			return "satisfactionresults";
		}

	
	
    @RequestMapping(value = "footballsurvey", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("footballsurvey", new FootballSurvey());
        return "footballsurvey";
    }
    @RequestMapping(value = "satisfactionsurvey", method = RequestMethod.GET)
    public String list2(Model model) {
        model.addAttribute("satisfactionsurvey", new SatisfactionSurvey());
        return "satisfactionsurvey";
    }
	@RequestMapping(value = "/savefootball", method = RequestMethod.POST)
    public String saveFootball( FootballSurvey FootballSurvey) {
        fservice.save(FootballSurvey);
        return "redirect:/footballresults" ;
    }
	
	@RequestMapping(value = "/savesatisfaction", method = RequestMethod.POST)
    public String saveSatisfaction( SatisfactionSurvey SatisfactionSurvey) {
        sservice.save(SatisfactionSurvey);
        return "redirect:/satisfactionresults" ;
    }

}
