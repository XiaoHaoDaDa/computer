package com.hp.action;

import java.util.List;

import com.hp.bean2.Javaprojece;
import com.hp.dao.JavaProDao;
import com.opensymphony.xwork2.ActionSupport;

import net.sf.json.JSONArray;

public class Java extends ActionSupport {
	private JavaProDao dao;
	private Integer id;
	private List<Javaprojece> list;
	private JSONArray res;
	int i;
	int k;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public JSONArray getRes() {
		return res;
	}

	public void setRes(JSONArray res) {
		this.res = res;
	}

	public List<Javaprojece> getList() {
		return list;
	}

	public void setList(List<Javaprojece> list) {
		this.list = list;
	}

	/*
	 * public Integer getLittelProject() { return littelProject; }
	 * 
	 * public void setLittelProject(Integer littelProject) { this.littelProject =
	 * littelProject; }
	 */

	public JavaProDao getDao() {
		return dao;
	}

	public void setDao(JavaProDao dao) {
		this.dao = dao;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub		
		list = dao.find(id);
		res = JSONArray.fromObject(list);
		return super.execute();
	}
	public String one() {
		id=0;
		list = dao.find(id);
		res = JSONArray.fromObject(list);
		return SUCCESS;
	}

	public String findall() {
		list=dao.findall();
		res = JSONArray.fromObject(list);
		System.out.println(res);
		return SUCCESS;
	}

}
