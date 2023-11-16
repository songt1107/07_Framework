package edu.kh.project.manager.model.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.kh.project.manager.model.vo.ManagerVO;

@Repository
public class ManagerDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSession;

	
	public int createManager(ManagerVO inputManager) {
		return sqlSession.insert("managerMapper.createManager", inputManager);
	}

	public List<ManagerVO> readManager(String managerName) {
		return sqlSession.selectList("managerMapper.readManager", managerName);
	}

	public int updateManager(String managerName) {
		return sqlSession.update("managerMapper.updateManager", managerName);
	}

	public int deleteManager(String managerName) {
		return sqlSession.delete("managerMapper.deleteManager", managerName);
	}
	
	
	
}
