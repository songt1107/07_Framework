package edu.kh.project.student.model.service;

import java.util.List;

import edu.kh.project.student.model.vo.StudentVO;

public interface StudentService {

	int createStudent(StudentVO inputStudent);
	
	List<StudentVO> readStudent(String studentName);

	int updateStudent(String studentName);

	int deleteStudent(String studentName);

	
}

