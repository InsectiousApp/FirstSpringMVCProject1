package com.cyris.webd1;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class StudentAdmissionController{
 
	@RequestMapping(value="/main", method=RequestMethod.GET)
	public ModelAndView helloworld(){
	
		ModelAndView model=new ModelAndView("AdmissionForm");
		return model;
	
	}

	@RequestMapping(value="/admissionformsuccess", method=RequestMethod.POST)
	public ModelAndView mainfunction(@ModelAttribute("student1") Student student1){
		
		
		ModelAndView model=new ModelAndView("admissionformsuccess");
		return model;
		
	}
	
	
}