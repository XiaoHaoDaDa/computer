package com.hp.bean;

public class ComputerType {
	private Integer cid; //配件编号 
	private String type_name;//配件名称	
	private String  capacity;//容量
	private Integer price;//价格;
	private Comtype ct;

	public Comtype getCt() {
		return ct;
	}
	public void setCt(Comtype ct) {
		this.ct = ct;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getType_name() {
		return type_name;
	}
	public void setType_name(String type_name) {
		this.type_name = type_name;
	}
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "ComputerType [cid=" + cid + ", Type_name=" + type_name + ", capacity=" + capacity + ", price=" + price
				+ ", ct=" + "]";
	}



}
