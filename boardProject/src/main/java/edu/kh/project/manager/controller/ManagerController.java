package edu.kh.project.manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.kh.project.manager.model.service.ManagerService;
import edu.kh.project.manager.model.vo.ManagerVO;

@Controller
@RequestMapping("/manager")
public class ManagerController {
	
	@Autowired
	private ManagerService service;
	
	
	@PostMapping("/regist")
	public int createManager(ManagerVO inputManager, Model model) {
		
		int createManager = service.createManager(inputManager);
		
		return createManager;
	}
	
	
	@GetMapping("/list")
	public String readManager(String managerName, Model model) {
		
		List<ManagerVO> ManagerList = service.readManager(managerName);
		
		return null;
	}
	
	
	@PostMapping("/update")
	public int updateManager(String managerName, Model model) {
		
		int managerList = service.updateManager(managerName);
		
		return managerList;
	}
	
	
	@PostMapping("/delete")
	public int deleteManager(String managerName, Model model) {
		
		int deleteManager = service.deleteStudent(managerName);
		
		return deleteManager;
	}
}
