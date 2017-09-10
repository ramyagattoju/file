package com.svk.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.svk.Student.Student;
import com.svk.service.StudentService;

public class StudentController extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		
		ModelAndView mv = new ModelAndView();
		
		StudentService ss = new StudentService();
		List<Student> studDetails = ss.getStudentDetails();
		
		mv.addObject("studentInfo", studDetails);
		mv.setViewName("studentJsp");
		
		return mv;
	}

}
