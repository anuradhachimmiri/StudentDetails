package com.web.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.Entity.StudentEntity;
import com.web.Service.StudentService;
@Controller
public class StudentController {
	@Autowired
	private StudentService service;
	@RequestMapping("/")
	public String homePage()
	{
		return "home";
	}
	@RequestMapping("/addstudent")
	public String studentForm()
	{
		return "student";
	}
	@RequestMapping("/register")
	public String addStudent(StudentEntity student)
	{
		StudentEntity save=service.saveStudent(student);
		return "success";
	}
	@RequestMapping("/viewstudent")
	public String viewStudents(ModelMap model)
	{
		model.put("students", service.getAllStudentRecord());
		return "view";
	}
	@RequestMapping("/delete/{studentRollNumber}")
	public String delete(@PathVariable int studentRollNumber)
	{
		service.deleteStudentRecord(studentRollNumber);
		return "redirect:/viewstudent";
	}
	@RequestMapping("/edit/{studentRollNumber}")
	public String getStudent(@PathVariable int studentRollNumber , ModelMap model)
	{
		model.put("command", service.getOneStudentRecord(studentRollNumber));
		return "editform";
	}
	@RequestMapping("/editandsave")
	public String update(StudentEntity student)
	{
		StudentEntity get = service.updateAllStudents(student);
		return "redirect:/viewstudent";
	}

}


