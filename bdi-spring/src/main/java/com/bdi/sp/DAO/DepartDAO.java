package com.bdi.sp.DAO;

import java.util.List;

import com.bdi.sp.vo.Depart;

public interface DepartDAO {

	public List<Depart> selectDepartList(Depart di);
}
