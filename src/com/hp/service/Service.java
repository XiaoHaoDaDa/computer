package com.hp.service;

import java.util.List;

import com.hp.bean.Computer;
import com.hp.bean.ComputerType;
import com.hp.bean.Comtype;

public interface Service {
	//查询配件
		public List<Computer> selectcom();
		//添加电脑配件
		public void addcomtype(ComputerType computertype) ;
		//查询电脑配件表
		public List<ComputerType> selectcomtype();
		
		//添加电脑
		public void addcom(Computer computer) ;
		//删除
		public void delectcom( Computer computer);
		//修改
		public void updata(Computer computer);
		//查询Type
		public List<Comtype> selectType();
		
		//fenye
		public List<ComputerType> selectfenye(Integer page,Integer rows);
		
		//添加寻找部分内容
		public List<ComputerType> findct(int ct);
		//
		public List<Computer> Getonecomname(int cid);
		
		public List<ComputerType>  findprice(int cid);

}
