package com.spring.survey.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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
    
 // ------------------------------
    
    
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
	
 // ------------------------------
	 @RequestMapping(value={"/editfootball/{id}"}, method = RequestMethod.GET)
	    public String EditForm(Model model, @PathVariable(required = false, name = "id") Integer id) {
	        
	            model.addAttribute("editfootball", fservice.findOne(id));
	         
	        return "editfootball";
	    }

	 @RequestMapping(value="/editfootball", method = RequestMethod.POST)
	    public String Edit(Model model,FootballSurvey FootballSurvey) {
	    	fservice.save(FootballSurvey);
	        model.addAttribute("editfootball", fservice.getFootballSurveyList());
	        return "redirect:/footballresults";
	    }
	 
	 @RequestMapping(value="/deletefootball/{id}", method = RequestMethod.GET)
	    public String Delete(Model model, @PathVariable(required = true, name = "id") int id) {
	    	fservice.delete(id);
	        model.addAttribute("deletefootball", fservice.getFootballSurveyList());
	        return "redirect:/footballresults";
	    }
	 
	// ------------------------------
	 
	 
	 
	 @RequestMapping(value={"/editsatisfaction/{id}"}, method = RequestMethod.GET)
	    public String editSatisfaction(Model model, @PathVariable(required = false, name = "id") Integer id) {
	        
	            model.addAttribute("editsatisfaction", sservice.findOne(id));
	         
	        return "editsatisfaction";
	    }

	 @RequestMapping(value="/editsatisfaction", method = RequestMethod.POST)
	    public String Edit2(Model model,SatisfactionSurvey SatisfactionSurvey) {
	    	sservice.save(SatisfactionSurvey);
	        model.addAttribute("editsatisfaction", sservice.getSatisfactionSurveyList());
	        return "redirect:/satisfactionresults";
	    }
	 
	 @RequestMapping(value="/deletesatisfaction/{id}", method = RequestMethod.GET)
	    public String deleteSatisfaction(Model model, @PathVariable(required = true, name = "id") int id) {
	    	sservice.delete(id);
	        model.addAttribute("deletesatisfaction", sservice.getSatisfactionSurveyList());
	        return "redirect:/satisfactionresults";
	    }
}
