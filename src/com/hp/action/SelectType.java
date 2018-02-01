package com.hp.action;

import java.util.List;

import com.hp.service.Service;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import net.sf.json.JSONArray;

public class SelectType extends ActionSupport{
	private List list;
	private Service service;
	String res;
	public String getRes() {
		return res;
	}
	public void setRes(String res) {
		this.res = res;
	}
	public void setList(List list) {
		this.list = list;
	}
	public void setService(Service service) {
		this.service = service;
	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		list=service.selectType();
		res = String.valueOf(JSONArray.fromObject(list));
		
		return super.execute();
	}

}
