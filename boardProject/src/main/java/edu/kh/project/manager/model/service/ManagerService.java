package edu.kh.project.manager.model.service;

import java.util.List;

import edu.kh.project.manager.model.vo.ManagerVO;

public interface ManagerService {

	int createManager(ManagerVO inputManager);

	List<ManagerVO> readManager(String managerName);

	int updateManager(String managerName);

	int deleteStudent(String managerName);

}
