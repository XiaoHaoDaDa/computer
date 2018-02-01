package com.hp.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.hp.bean2.Javaprojece;

public class JavaProDaoimp implements JavaProDao {
	private HibernateTemplate h;

	public HibernateTemplate getH() {
		return h;
	}

	public void setH(HibernateTemplate h) {
		this.h = h;
	}

	public List<Javaprojece> find(Integer littelProject) {
		// TODO Auto-generated method stub
		return (List<Javaprojece>) h.find("from Javaprojece where pid="+littelProject);
	}

	public List<Javaprojece> findall() {
		// TODO Auto-generated method stub
		return  (List<Javaprojece>) h.find("from Javaprojece ");
	}

}
