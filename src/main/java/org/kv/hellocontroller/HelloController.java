package org.kv.hellocontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/greet")
public class HelloController{

	@RequestMapping("/welcome")
	public ModelAndView helloWorld(){
		ModelAndView modelAndView = new ModelAndView("HelloPage");
		modelAndView.addObject("msg","Hello World");
		return modelAndView;
	}

	@RequestMapping("/hi")
	public ModelAndView hiWorld(){
		ModelAndView modelAndView = new ModelAndView("HelloPage");
		modelAndView.addObject("msg","Hi World");
		return modelAndView;
	}
}