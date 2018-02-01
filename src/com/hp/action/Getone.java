package com.hp.action;

import java.util.List;

import com.hp.bean.Computer;
import com.hp.service.Service;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class Getone extends ActionSupport{
	private  Service service;
	private  int cid;
	private Computer computer;
	private String name;
	private Integer price;
	private int id;
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Integer getPrice() {
		return price;
	}


	public void setPrice(Integer price) {
		this.price = price;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public Service getService() {
		return service;
	}


	public void setService(Service service) {
		this.service = service;
	}


	public int getCid() {
		return cid;
	}


	public void setCid(int cid) {
		this.cid = cid;
	}


	public Computer getComputer() {
		return computer;
	}


	public void setComputer(Computer computer) {
		this.computer = computer;
	}


	@Override
	public String execute() throws Exception {
		 List<Computer> list = service.Getonecomname(cid);
		 name = list.get(0).getCom_name();
		 price = list.get(0).getPrice();
		 id=list.get(0).getCom_id();
		System.out.println(id);
		return SUCCESS;
	}

}
