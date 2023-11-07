package edu.kh.project.user.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.kh.project.user.model.dao.UserDAO;
import edu.kh.project.user.model.vo.User;

@Service
public class UserServiceImpl implements UserService { // implements 입력
	
	@Autowired
	private UserDAO dao;

	@Override
	public List<User> selectUser(String userNo) {
		return dao.selectUser(userNo); // dao 호출
	}

}
