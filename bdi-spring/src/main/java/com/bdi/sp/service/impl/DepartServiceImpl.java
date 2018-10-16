package com.bdi.sp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bdi.sp.DAO.DepartDAO;
import com.bdi.sp.service.DepartService;
import com.bdi.sp.vo.Depart;

@Service
public class DepartServiceImpl implements DepartService{

	@Autowired
	private DepartDAO ddao;
	@Override
	public List<Depart> selectDepartList(Depart di) {
		return ddao.selectDepartList(di);
	}

}
