package com.bdi.sp.DAO.Impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bdi.sp.DAO.JapanDAO;
import com.bdi.sp.vo.Japan;

@Repository
public class JapanDAOImpl implements JapanDAO {

	@Autowired
	private SqlSession ss;
	
	@Override
	public List<Japan> selectJapanList(Japan jp) {
		return ss.selectList("com.bdi.sp.JapanMapper.selectJapanList");
	}

	@Override
	public Japan selectJapan(int jpnum) {
		return ss.selectOne("com.bdi.sp.JapanMapper.selectJapan",jpnum);
	}

}
