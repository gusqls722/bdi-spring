package com.bdi.sp.DAO.Impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bdi.sp.DAO.DepartDAO;
import com.bdi.sp.vo.Depart;

@Repository
public class DepartDAOImpl implements DepartDAO {

	@Autowired
	private SqlSession ss;
	
	@Override
	public List<Depart> selectDepartList(Depart di) {
		return ss.selectList("com.bdi.sp.DepartManager.selectDepartList");
	}

}
