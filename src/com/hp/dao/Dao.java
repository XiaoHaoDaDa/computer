package com.hp.dao;

import java.util.List;

import com.hp.bean.Computer;
import com.hp.bean.ComputerType;
import com.hp.bean.Comtype;

public interface Dao {
	//��ѯ����
	public List<Computer> selectcom();
	//��ӵ������
	public void addcomtype(ComputerType computertype ) ;
	//��ӵ���
	public void addcom(Computer computer);
	
	//�鿴�������
	public List<ComputerType> selectcomtype();
	//ɾ��
	public void delectcom( Computer computer);
	//�޸�
	
	public void updata( Computer computer);
	//��ѯ���ͱ�
	public List<Comtype> selectType();
	//��ҳ
	public  List<ComputerType> selectfenye(Integer page ,Integer rows) ;
	
	//���Ѱ�Ҳ�������
	public List<ComputerType> findct(int ct);
	//
	public List<Computer> Getonecomname(int cid);
	
	public void addcomtype(Comtype comtype ) ;
	
	public List<ComputerType>  findprice(int cid);

}
