package com.hp.action;

import java.util.List;

import com.hp.bean.Computer;
import com.hp.service.Service;
import com.opensymphony.xwork2.ActionSupport;

import net.sf.json.JSON;
import net.sf.json.JSONArray;

public class Findprice extends ActionSupport{
	private Service service;
	private Computer computer;
	int ct;
	private List list;
	private String result;

	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}

	public int getCt() {
		return ct;
	}
	public void setCt(int ct) {
		this.ct = ct;
	}
	public Service getService() {
		return service;
	}
	public void setService(Service service) {
		this.service = service;
	}
	public Computer getComputer() {
		return computer;
	}
	public void setComputer(Computer computer) {
		this.computer = computer;
	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(ct);
		list=service.findprice(ct);
		JSONArray json = new JSONArray();
		result = String.valueOf(json.fromObject(list));
		return SUCCESS;
	}

}
