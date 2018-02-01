package com.hp.bean2;

public class Javaprojece {
	private Integer id;
	//id,text,iconCls,checked,state,attribute,target
	private Integer pid;
	private String text;
	private String state;
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	private String checked;
	private String children;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getChecked() {
		return checked;
	}
	public void setChecked(String checked) {
		this.checked = checked;
	}
	public String getChildren() {
		return children;
	}
	public void setChildren(String children) {
		this.children = children;
	}
	@Override
	public String toString() {
		return "Javaprojece [id=" + id + ", text=" + text + ", state=" + state + ", checked=" + checked + ", children="
				+ children + "]";
	}
	
	
	

}
