package com.hp.dao;

import java.util.List;

import com.hp.bean.Computer;
import com.hp.bean.ComputerType;
import com.hp.bean.Comtype;

public interface Dao {
	//查询电脑
	public List<Computer> selectcom();
	//添加电脑配件
	public void addcomtype(ComputerType computertype ) ;
	//添加电脑
	public void addcom(Computer computer);
	
	//查看电脑配件
	public List<ComputerType> selectcomtype();
	//删除
	public void delectcom( Computer computer);
	//修改
	
	public void updata( Computer computer);
	//查询类型表
	public List<Comtype> selectType();
	//分页
	public  List<ComputerType> selectfenye(Integer page ,Integer rows) ;
	
	//添加寻找部分内容
	public List<ComputerType> findct(int ct);
	//
	public List<Computer> Getonecomname(int cid);
	
	public void addcomtype(Comtype comtype ) ;
	
	public List<ComputerType>  findprice(int cid);

}
