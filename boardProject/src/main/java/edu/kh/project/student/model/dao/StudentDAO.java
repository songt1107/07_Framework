package edu.kh.project.student.model.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.kh.project.student.model.vo.StudentVO;

@Repository
public class StudentDAO {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	
	public int createStudent(StudentVO inputStudent) {
		return sqlSession.insert("studentMapper.createStudent", inputStudent);
	}
	
	public List<StudentVO> readStudent(String studentName) {
		return sqlSession.selectList("studentMapper.readStudent", studentName);
	}

	public int updateStudent(String studentName) {
		return sqlSession.update("studentMapper.updateStudent", studentName);
	}

	public int deleteStudent(String studentName) {
		return sqlSession.delete("studentMapper.deleteStudent", studentName);
	}


}
