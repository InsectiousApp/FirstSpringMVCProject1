package com.cyris.webd1;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class StudentAdmissionController{
 
	@RequestMapping(value="/main", method=RequestMethod.GET)
	public ModelAndView helloworld(){
	
		ModelAndView model=new ModelAndView("AdmissionForm");
		return model;
	
	}

	@RequestMapping(value="/admissionformsuccess", method=RequestMethod.POST)
	public ModelAndView mainfunction(@RequestParam(value="studentName", defaultValue="Mr. Chetan") String name, @RequestParam(value="studentHobby", defaultValue="GYM") String hobby){
		
		ModelAndView model=new ModelAndView("admissionformsuccess");
		model.addObject("msg", "Congrats "+name+" we added your hobby : "+hobby);
		return model;
		
	}
	
	
}