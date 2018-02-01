package com.hp.dao;

import java.util.List;

import com.hp.bean2.Javaprojece;

public interface JavaProDao {
	
	public List<Javaprojece> find(Integer littelProject);
	
	public List<Javaprojece> findall();

}
