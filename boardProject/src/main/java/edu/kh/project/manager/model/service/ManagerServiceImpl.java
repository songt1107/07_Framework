package edu.kh.project.manager.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.kh.project.manager.model.dao.ManagerDAO;
import edu.kh.project.manager.model.vo.ManagerVO;

@Service
public class ManagerServiceImpl implements ManagerService {

	@Autowired
	private ManagerDAO dao;
	
	
	@Override
	public int createManager(ManagerVO inputManager) {
		return dao.createManager(inputManager);
	}

	@Override
	public List<ManagerVO> readManager(String managerName) {
		return dao.readManager(managerName);
	}

	@Override
	public int updateManager(String managerName) {
		return dao.updateManager(managerName);
	}

	@Override
	public int deleteStudent(String managerName) {
		return dao.deleteManager(managerName);
	}

}
