package org.kv.studentadmissioncontroller;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Created by KV on 20/12/2016.
 */


@Controller
public class StudentAdmissionController {

	@InitBinder
	public void initBinder(WebDataBinder binder){
//		binder.setDisallowedFields("studentMobile");

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy****MM****dd");

		binder.registerCustomEditor(
				Date.class,
				"studentDOB",
				new CustomDateEditor(dateFormat,
				false));

		binder.registerCustomEditor(
				String.class,
				"studentName",
				new StudentNameEditor());
	}

	@RequestMapping(value = "/admissionForm.html",method = RequestMethod.GET)
	public ModelAndView getAdmissionForm(){
		ModelAndView model = new ModelAndView("AdmissionForm");
		return model;
	}

	@ModelAttribute
	public void addingCommonObjects(Model model){
		model.addAttribute("headerMessage","Gontu College of Engineering, India");
	}

	@RequestMapping(value = "/submitAdmissionForm.html", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(
			@Valid
			@ModelAttribute("student1") Student student1,
			BindingResult result){

		if(result.hasErrors()){
			return new ModelAndView("AdmissionForm");
		}

		ModelAndView model = new ModelAndView("AdmissionSuccess");

		return model;
	}
}
