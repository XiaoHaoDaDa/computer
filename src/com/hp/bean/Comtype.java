package com.hp.bean;

public class Comtype {
	private Integer cid;
	private Integer type_id;//������ 
	private String type;//�������
	public Integer getType_id() {
		return type_id;
	}
	public void setType_id(Integer type_id) {
		this.type_id = type_id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Type [type_id=" + type_id + ", type=" + type + "]";
	}

}
