package com.talibi.sms.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.talibi.sms.models.Student;
import com.talibi.sms.services.StudentService;

@Controller
public class StudentController {
	
	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	} 
	
	@GetMapping("/students")
	public String listStudents(Model model) {
		model.addAttribute("students", studentService.getAllStudents());
		return "students";
	}
	
	@GetMapping("/students/new")
	public String studentAdd(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return "studentAdd";
	}
	
	@PostMapping("/students")
	public String saveNewStudent(@ModelAttribute("student") Student student) {
		studentService.saveNewStudent(student);
		return "redirect:/students";
	}
}
