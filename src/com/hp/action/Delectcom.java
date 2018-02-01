package com.hp.action;

import com.hp.bean.Computer;
import com.hp.service.Service;
import com.opensymphony.xwork2.ActionSupport;

public class Delectcom extends ActionSupport{

	private Service service;
	private Computer computer;
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
		service.delectcom(computer);
		return super.execute();
	}

}
