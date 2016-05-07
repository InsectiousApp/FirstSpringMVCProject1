package com.cyris.webd1;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class HelloController{
 
	@RequestMapping("/main")
	public ModelAndView helloworld(@PathVariable Map<String,String> pathVars){
		
		String name=pathVars.get("username");
		String countryname=pathVars.get("countryname");
		
		ModelAndView model=new ModelAndView("HelloPage");
		model.addObject("msg", "Hi "+name+" welcome to "+countryname);
		return model;
	}
	
	@RequestMapping("/main/index")
	public ModelAndView mainfunction(){
		ModelAndView model=new ModelAndView("HelloPage");
		model.addObject("msg", "hey");
		return model;
	}
	
	
}