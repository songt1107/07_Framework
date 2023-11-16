package edu.kh.project.student.model.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.kh.project.student.model.dao.StudentDAO;
import edu.kh.project.student.model.vo.StudentVO;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDAO dao;
	
	
	@Override
	public int createStudent(StudentVO inputStudent) {
		return dao.createStudent(inputStudent);
	}
	
	@Override
	public List<StudentVO> readStudent(String studentName) {
		return dao.readStudent(studentName);
	}

	@Override
	public int updateStudent(String studentName) {
		return dao.updateStudent(studentName);
	}

	@Override
	public int deleteStudent(String studentName) {
		return dao.deleteStudent(studentName);
	}

	
}
