package com.hp.service;
import java.util.List;

import com.hp.bean.Computer;
import com.hp.bean.ComputerType;
import com.hp.bean.Comtype;
import com.hp.dao.Dao;

public class Serviceimple implements Service{
 private Dao dao;
	public void setDao(Dao dao) {
	this.dao = dao;
}
//��ѯ����
	public List<Computer> selectcom() {
		// TODO Auto-generated method stub
		return dao.selectcom();
	}
//��ӵ������
	public void addcomtype(ComputerType computertype) {
		// TODO Auto-generated method stub
		dao.addcomtype(computertype);		
	}
	public List<ComputerType> selectcomtype() {
		// TODO Auto-generated method stub
		return dao.selectcomtype();
	}
	public void addcom(Computer computer) {
		// TODO Auto-generated method stub
		dao.addcom(computer);
		
	}
	public List<Comtype> selectType() {
		// TODO Auto-generated method stub
		return dao.selectType();
	}
	public List<ComputerType> selectfenye(Integer page,Integer rows) {
		// TODO Auto-generated method stub
		return dao.selectfenye(page,rows);
	}
	public void delectcom(Computer computer) {
		// TODO Auto-generated method stub
		dao.delectcom(computer);
	}
	public List<ComputerType> findct(int ct) {
		// TODO Auto-generated method stub
		return dao.findct(ct);
	}
	public List<Computer> Getonecomname(int cid) {
		// TODO Auto-generated method stub
		return dao.Getonecomname(cid);
	}
	public List<ComputerType> findprice(int cid) {
		// TODO Auto-generated method stub
		return dao.findprice(cid);
	}
	public void updata(Computer computer) {
		// TODO Auto-generated method stub
		dao.updata(computer);
	}


	
}
