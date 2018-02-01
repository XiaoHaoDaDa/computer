package com.hp.action;

import java.util.List;

import com.hp.bean.ComputerType;
import com.hp.bean.Comtype;
import com.hp.service.Service;
import com.opensymphony.xwork2.ActionSupport;

import net.sf.json.JSON;
import net.sf.json.JSONArray;

public class AddcomputerType extends ActionSupport {
	private Comtype type;
	private ComputerType computertype;
	private Service service;
	private String tid;
	private List list;
	private List list1;
	private int maxcount;
	private int maxpage;
	private int page;
	String res;

	public String getRes() {
		return res;
	}

	public void setRes(String res) {
		this.res = res;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	public List getList1() {
		return list1;
	}

	public void setList1(List list1) {
		this.list1 = list1;
	}

	public int getMaxcount() {
		return maxcount;
	}

	public void setMaxcount(int maxcount) {
		this.maxcount = maxcount;
	}

	public int getMaxpage() {
		return maxpage;
	}

	public void setMaxpage(int maxpage) {
		this.maxpage = maxpage;
	}

	public Service getService() {
		return service;
	}

	public String getTid() {
		return tid;
	}

	public Comtype getType() {
		return type;
	}

	public void setType(Comtype type) {
		this.type = type;
	}

	public ComputerType getComputertype() {
		return computertype;
	}

	public void setComputertype(ComputerType computertype) {
		this.computertype = computertype;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	public void setService(Service service) {
		this.service = service;
	}

	@Override
	public String execute() throws Exception {
	
		
		list1 = service.selectcomtype();
		maxcount = list1.size();
		maxpage = maxcount % 5 == 0 ? maxcount / 5 : maxcount / 5 + 1;

		Integer ttid = Integer.parseInt(tid);
		type.setType_id(ttid);
		computertype.setCt(type);
		service.addcomtype(computertype);
		return SUCCESS;
	}

}
