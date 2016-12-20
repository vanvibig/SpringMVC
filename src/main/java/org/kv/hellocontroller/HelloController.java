package org.kv.hellocontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class HelloController{

	@RequestMapping("/welcome/{countryName}/{userName}")
	public ModelAndView helloWorld(@PathVariable Map<String,String> pathVars){

		String name = pathVars.get("userName");
		String country = pathVars.get("countryName");

		ModelAndView modelAndView = new ModelAndView("HelloPage");
		modelAndView.addObject("msg","Hello " + name + " You are from " + country);

		return modelAndView;
	}
}