package edu.kh.project.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import edu.kh.project.user.model.service.UserService;
import edu.kh.project.user.model.vo.User;

@Controller // Controller + Bean 등록
public class UserController {
	
	@Autowired
	private UserService service;
	
	
	@GetMapping("/selectUser")
	public String selectUser(String userNo, Model model) { // model 추가
		
		// 회원 정보 번호로 검색
		List<User> userList = service.selectUser(userNo); // List 서비스 설정
		
		if( !userList.isEmpty() ) { // 유저리스트가 존재하면
			
			// page - request - session - application
			// request : 현재 페이지 -> 포워드 받은 페이지
			model.addAttribute("userList", userList);
			return "searchSuccess"; // searchSuccess 실행
			
		} else {
			
			return "searchFail"; // searchFail 실행
			
		}
		
	}
	
	
}
