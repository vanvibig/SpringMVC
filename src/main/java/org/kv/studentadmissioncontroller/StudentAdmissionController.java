package org.kv.studentadmissioncontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * Created by KV on 20/12/2016.
 */


@Controller
@RequestMapping("/admissionForm")
public class StudentAdmissionController {

//	@RequestMapping(value = "/admissionForm.html",method = RequestMethod.GET)
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView getAdmissionForm(){
		ModelAndView model = new ModelAndView("AdmissionForm");
		return model;
	}

//	@RequestMapping(value = "/submitAdmissionForm.html", method = RequestMethod.POST)
	@RequestMapping(method = RequestMethod.POST)
		public ModelAndView submitAdmissionForm(
			@RequestParam Map<String,String> reqMap
			){

		String name = reqMap.get("studentName");
		String hobby = reqMap.get("studentHobby");
		ModelAndView modelAndView = new ModelAndView("AdmissionSuccess");
		modelAndView.addObject("msg","Details submitted by you:: Name: " + name + ", Hobby: " + hobby);

		return modelAndView;
	}
}
