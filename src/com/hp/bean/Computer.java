package com.hp.bean;

public class Computer {

	//
	private Integer com_id;//��������
	private String com_name;//����
	private ComputerType memory;//�ڴ�
	private ComputerType cpu;//cpu
	private ComputerType videocard;//�Կ�
	private ComputerType display;//��ʾ��
	private ComputerType hdd;//Ӳ��
	private Integer price;//�۸�
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
