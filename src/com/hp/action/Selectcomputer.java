package com.hp.action;

import java.util.List;

import com.hp.bean.Computer;
import com.hp.service.Service;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import net.sf.json.JSON;
import net.sf.json.JSONArray;

public class Selectcomputer extends ActionSupport {
	private Service service;
	private List list;
	private JSONArray res;

	public JSONArray getRes() {
		return res;
	}

	public void setRes(JSONArray res) {
		this.res = res;
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		list = service.selectcom();
		return super.execute();
	}

	public String selectcomjson() {
		list = service.selectcom();
		res = JSONArray.fromObject(list);
		System.out.println(res);
		return SUCCESS;

	}

}
