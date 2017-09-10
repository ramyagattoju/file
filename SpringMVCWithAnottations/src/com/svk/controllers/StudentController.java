package com.svk.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.svk.Student.Student;
import com.svk.service.StudentService;

@Controller
@RequestMapping("/studentRef.htm")
public class StudentController{

	@Autowired
	StudentService ss;
	
	@RequestMapping(method = RequestMethod.GET)
	public String prinetStudentDetails(ModelMap model) throws Exception {
		
		List<Student> studDetails = ss.getStudentDetails();
		model.addAttribute("studentInfo", studDetails);
		
		return "studentJsp";
	}

}
