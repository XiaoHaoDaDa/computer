package com.hp.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.hp.bean.Computer;
import com.hp.bean.ComputerType;
import com.hp.bean.Comtype;

public class Daoimple implements Dao {
	private HibernateTemplate h;

	public HibernateTemplate getH() {
		return h;
	}

	public void setH(HibernateTemplate h) {
		this.h = h;
	}
//≤È—ØµÁƒ‘
	public List<Computer> selectcom() {
		// TODO Auto-generated method stub

		return (List<Computer>) h.find(" FROM Computer ");
	}

	public void addcomtype(ComputerType computertype) {
		// TODO Auto-generated method stub

		h.save(computertype);

	}

	public void addcom(Computer computer) {
		// TODO Auto-generated method stub
		h.save(computer);
	}


	public List<ComputerType> selectcomtype() {
		// TODO Auto-generated method stub
		return (List<ComputerType>) h.find("from ComputerType");
	}

	public List<Comtype> selectType() {
		// TODO Auto-generated method stub

		return (List<Comtype>) h.find("from Comtype");
	}

	public List<ComputerType> selectfenye(Integer page,final Integer rows) {
		// TODO Auto-generated method stub
		final int pagesize = (page - 1) * rows;
		List<ComputerType> ob = h.execute(new HibernateCallback() {

			public Object doInHibernate(Session session) throws HibernateException {
				// TODO Auto-generated method stub
				Query list =  session.createQuery("from ComputerType");
				list.setFirstResult(pagesize);
				list.setMaxResults(rows);
				return list.list();
			}
		});

		return ob;
	}

	public void delectcom(Computer computer) {
		// TODO Auto-generated method stub
		h.delete(computer);
	}

	public List<ComputerType> findct(int ct) {
		// TODO Auto-generated method stub
		
		return (List<ComputerType>) h.find("from ComputerType where ct="+ct);
	}

	public List<Computer> Getonecomname(int cid) {
		// TODO Auto-generated method stub		
		return (List<Computer>) h.find("from Computer where com_id="+cid);
	}

	public void addcomtype(Comtype comtype) {
		// TODO Auto-generated method stub
		h.save(comtype);
	}

	public List<ComputerType> findprice(int cid) {
		// TODO Auto-generated method stub
		return (List<ComputerType>) h.find("from ComputerType where cid="+cid);
	}

	public void updata(Computer computer) {
		// TODO Auto-generated method stub
		h.update(computer);		
	}

}
