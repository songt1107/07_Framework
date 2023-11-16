package edu.kh.project.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import edu.kh.project.student.model.service.StudentService;
import edu.kh.project.student.model.vo.StudentVO;


@Controller
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService service;
	
	
	@PostMapping("/regist")
	public int createStudent(StudentVO inputStudent, Model model,
								RedirectAttributes ra
								) {
		
		int createStudent = service.createStudent(inputStudent);
		
		return createStudent;
	}
	
	
	@GetMapping("/list")
	public String readStudent(String studentName, Model model) {
		
		List<StudentVO> studentList = service.readStudent(studentName);

		if( !studentList.isEmpty() ) {
			
			model.addAttribute("studentList", studentList);
			return "searchSuccess";
			
		} else {
			
			return "searchFail";
			
		}
		
	}
	
	
	@PostMapping("/update")
	public int updateStudent(String studentName, Model model) {

		int studentList = service.updateStudent(studentName);
		
		return studentList;
	}
	
	
	@PostMapping("/delete")
	public int deleteStudent(String studentName, Model model) {

		int deleteStudent = service.deleteStudent(studentName);
		
		return deleteStudent;
	}
	
	
}
