package edu.kh.project.user.model.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.kh.project.user.model.vo.User;

@Repository // Repository 입력
public class UserDAO {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	
	public List<User> selectUser(String userId) {
		return sqlSession.selectList("userMapper.selectUser", userId); // sql 호출
	}

}
