package com.hp.service;

import java.util.List;

import com.hp.bean.Computer;
import com.hp.bean.ComputerType;
import com.hp.bean.Comtype;

public interface Service {
	//��ѯ���
		public List<Computer> selectcom();
		//��ӵ������
		public void addcomtype(ComputerType computertype) ;
		//��ѯ���������
		public List<ComputerType> selectcomtype();
		
		//��ӵ���
		public void addcom(Computer computer) ;
		//ɾ��
		public void delectcom( Computer computer);
		//�޸�
		public void updata(Computer computer);
		//��ѯType
		public List<Comtype> selectType();
		
		//fenye
		public List<ComputerType> selectfenye(Integer page,Integer rows);
		
		//���Ѱ�Ҳ�������
		public List<ComputerType> findct(int ct);
		//
		public List<Computer> Getonecomname(int cid);
		
		public List<ComputerType>  findprice(int cid);

}
