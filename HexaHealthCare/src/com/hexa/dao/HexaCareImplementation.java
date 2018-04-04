package com.hexa.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.hexa.entity.Appointment;

import com.hexa.entity.DoctorSchedule;
import com.hexa.entity.Doctors;

import com.hexa.entity.Specialization;

public class HexaCareImplementation implements HexaCareRemote {
	
	private static SessionFactory sfac;
	static {
		Configuration cfg = new AnnotationConfiguration();
		cfg.configure();
		sfac = cfg.buildSessionFactory();
	}

	@Override
	public List<Doctors> showDoctors() {
		Session sess = sfac.openSession();
		String hql = "from Doctors";
		Query qry = sess.createQuery(hql);
		List<Doctors> lst = qry.list();
		sess.close();
		return lst;
	}

	@Override
	public List<Specialization> showSpecializations() {
		Session sess = sfac.openSession();
		String hql = "from Specialization";
		Query qry = sess.createQuery(hql);
		List<Specialization> lst = qry.list();
		sess.close();
		return lst;
	}

	@Override
	public List<Doctors> doctorWithSpecialization(String specName) {
		
		Session sess = sfac.openSession();
		String hql = "from Doctors d inner join fetch d.spec s where s.specName=?";
	
		Query qry = sess.createQuery(hql);
		qry.setString(0,specName);
		List<Doctors> lst = qry.list();
		sess.close();
		return lst;
	}

	@Override
	public List<Appointment> showHistory() {
		
		Session sess = sfac.openSession();
		String hql = "from Appointment";
		Query qry = sess.createQuery(hql);
		List<Appointment> lst = qry.list();
		sess.close();
		return lst;
	}

	@Override
	public List<Appointment> showPatientHistory(long mobnum) {
		Session sess = sfac.openSession();
		String hql = "from Appointment where pContactNum=?";
	
		Query qry = sess.createQuery(hql);
		qry.setLong(0,mobnum);
		List<Appointment> lst = qry.list();
		sess.close();
		return lst;
	}

	@Override
	public List<DoctorSchedule> appointmentSchedule(int docId) {
		Session sess = sfac.openSession();
		String hql = "from DoctorSchedule ds inner join fetch ds.schdoc s where s.dId=?";
	
		Query qry = sess.createQuery(hql);
		qry.setInteger(0,docId);
		List<DoctorSchedule> lst = qry.list();
		sess.close();
		return lst;
	}

	@Override
	public int bookAppointment() {
		// TODO Auto-generated method stub
		Configuration cfg = new AnnotationConfiguration().configure();
		SessionFactory sfac = cfg.buildSessionFactory();
		Session sess=sfac.openSession();
		Transaction tx=sess.beginTransaction();
		Doctors d = new Doctors();
		d.setdId(101);
		Specialization s = new Specialization();
		s.setSpecId(100);
		Appointment a = new Appointment();
		a.setAptId(6);
		a.setpName("sri krishna");
		a.setpContactNum(8585858686l);
		
        sess.save(a);
		tx.commit();
		sess.close();
		System.out.println("row inserted");
		
		return 0;
	}



	

}
