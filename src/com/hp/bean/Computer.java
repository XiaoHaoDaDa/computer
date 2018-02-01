package com.hp.bean;

public class Computer {

	//
	private Integer com_id;//电脑名称
	private String com_name;//名称
	private ComputerType memory;//内存
	private ComputerType cpu;//cpu
	private ComputerType videocard;//显卡
	private ComputerType display;//显示器
	private ComputerType hdd;//硬盘
	private Integer price;//价格
	public Integer getCom_id() {
		return com_id;
	}
	public void setCom_id(Integer com_id) {
		this.com_id = com_id;
	}
	public String getCom_name() {
		return com_name;
	}
	public void setCom_name(String com_name) {
		this.com_name = com_name;
	}
	public ComputerType getMemory() {
		return memory;
	}
	public void setMemory(ComputerType memory) {
		this.memory = memory;
	}
	public ComputerType getCpu() {
		return cpu;
	}
	public void setCpu(ComputerType cpu) {
		this.cpu = cpu;
	}
	public ComputerType getVideocard() {
		return videocard;
	}
	public void setVideocard(ComputerType videocard) {
		this.videocard = videocard;
	}
	public ComputerType getDisplay() {
		return display;
	}
	public void setDisplay(ComputerType display) {
		this.display = display;
	}
	public ComputerType getHdd() {
		return hdd;
	}
	public void setHdd(ComputerType hdd) {
		this.hdd = hdd;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Computer [com_id=" + com_id + ", com_name=" + com_name + ", memory=" + memory + ", cpu=" + cpu
				+ ", videocard=" + videocard + ", display=" + display + ", hdd=" + hdd + ", price=" + price + "]";
	}


	
}
