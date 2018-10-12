package com.bdi.sp.DAO;

import java.util.List;

import com.bdi.sp.vo.Japan;

public interface JapanDAO {

	public List<Japan> selectJapanList(Japan jp);
	public Japan selectJapan(int jpnum);
}
