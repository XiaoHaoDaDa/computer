package com.hp.dao;

import static org.junit.Assert.*;

import java.applet.AppletContext;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hp.bean.Computer;
import com.hp.bean.ComputerType;
import com.hp.bean.Comtype;
import com.hp.bean2.Javaprojece;

public class test {

	@Test
	public void test() {
		ApplicationContext app=new  ClassPathXmlApplicationContext("springdb.xml");
		Dao dao=(Dao) app.getBean("daoimole");
		JavaProDao dao1 = (JavaProDao) app.getBean("JavaProDaoimp");
		Comtype t=new Comtype();
		
		t.setType("cup");
		t.setType_id(1);
		dao.addcomtype(t);
		t.setType("ÄÚ´æ");
		t.setType_id(2);
		dao.addcomtype(t);
		t.setType("ÏÔ¿¨");
		t.setType_id(3);
		dao.addcomtype(t);
		t.setType("Ó²ÅÌ");
		t.setType_id(4);
		dao.addcomtype(t);
		t.setType("ÏÔÊ¾Æ÷");
		t.setType_id(5);
		dao.addcomtype(t);
//		ComputerType c=new ComputerType();
//		c.setType_name("****ÏÔÊ¾Æ÷");
//		c.setPrice(100);
//		c.setCt(t);
//		
//		dao.addcomtype(c);
//	
//		Computer Computer = null;
//		List<Computer> list = dao.Getonecomname(5);
//		System.out.println(list.get(0).getCom_id());
		
//		List<Javaprojece> list1 = dao1.findall();
//		System.out.println(list1);
	}

}
