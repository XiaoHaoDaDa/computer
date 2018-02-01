package com.hp.action;

import java.util.List;


import com.hp.service.Service;
import com.opensymphony.xwork2.ActionSupport;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class FenYe extends ActionSupport {
	private int rows;
	private List list1;
	private List list;
	private Integer page;
	private Integer config;
	private int maxcount;
	private int total;
	private Service service;
	private JSONArray res;
	private JSONObject json;
	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	public JSONObject getJson() {
		return json;
	}

	public void setJson(JSONObject json) {
		this.json = json;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public JSONArray getRes() {
		return res;
	}

	public void setRes(JSONArray res) {
		this.res = res;
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

	public Integer getConfig() {
		return config;
	}

	public void setConfig(Integer config) {
		this.config = config;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
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
		if(config==0) {
			page=page+1;
		}else if(config==1){
			page=page-1;
		}
		list=service.selectfenye(page,rows);
		list1 = service.selectcomtype();
		total=list1.size();
		
		return super.execute();
	}
	
	public String fen() {
		list=service.selectfenye(page,rows);
		list1 = service.selectcomtype();
		total=list1.size();
		json=new JSONObject();
		json.put("total", total);
		json.put("rows", list);
		return SUCCESS;
		
	}

}
