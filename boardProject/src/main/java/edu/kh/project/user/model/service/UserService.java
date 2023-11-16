package edu.kh.project.user.model.service;

import java.util.List;

import edu.kh.project.user.model.vo.User;

public interface UserService {

	List<User> selectUser(String userNo); // 서비스 객체화

}
