package com.hp.action;

import java.util.List;

import com.hp.service.Service;
import com.opensymphony.xwork2.ActionSupport;

import net.sf.json.JSONArray;

public class Findct extends ActionSupport {
	private Service service;
	private int ct;
	private List list;
	private String result;
	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
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

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		list = service.findct(ct);
		JSONArray json = new JSONArray();
		result = String.valueOf(json.fromObject(list));
		return SUCCESS;
	}

}
