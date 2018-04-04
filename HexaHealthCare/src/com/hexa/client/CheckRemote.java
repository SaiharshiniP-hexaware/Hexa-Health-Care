package com.hexa.client;

import java.util.List;

import com.hexa.dao.HexaCareImplementation;
import com.hexa.dao.HexaCareRemote;
import com.hexa.entity.Appointment;
import com.hexa.entity.DoctorSchedule;
import com.hexa.entity.Doctors;
import com.hexa.entity.Specialization;

public class CheckRemote {

	public static void main(String[] args) {
		HexaCareRemote dao = new HexaCareImplementation();
		/*
		 * List<Doctors> lstdoc =dao.showDoctors();
		 * 
		 * for(Doctors d :lstdoc) {
		 * System.out.println(d.getdId()+" "+d.getdName()+" "+d.getdEmail()+" "+d.
		 * getdContact()+" "+d.getSpec().getSpecName()); }
		 * 
		 * List<Specialization> lstspec =dao.showSpecializations();
		 * 
		 * for(Specialization s :lstspec) {
		 * System.out.println(s.getSpecId()+" "+s.getSpecName()); }
		 

		List<Doctors> lstdoc = dao.doctorWithSpecialization("cardiology");

		for (Doctors d : lstdoc) {
			System.out.println(d.getdId() + " " + d.getdName() + " " + d.getdEmail() + " " + d.getdContact() + " "
					+ d.getSpec().getSpecName());
		}
		
		List<Appointment> lstaop =dao.showHistory();
		for(Appointment at:lstaop) {
			System.out.println(at.getAptId()+" "+at.getpName()+ " "+at.getpContactNum()+" "+at.getSch().getSchDate()+" "+at.getAptdoc().getdName());
		}
		
		List<Appointment> lstaph =dao.showPatientHistory(7858585205l);
		for(Appointment at:lstaph) {
			System.out.println(at.getAptId()+" "+at.getpName()+ " "+at.getpContactNum()+" "+at.getSch().getSchDate()+" "+at.getAptdoc().getdName());
		}
		*/
		/*
		List<DoctorSchedule> lstdoc=dao.appointmentSchedule(101);
		for(DoctorSchedule out:lstdoc) {
			System.out.println(out.getSchId()+" "+out.getNoOfApt()+" "+out.getSchDate()+" "+out.getSchdoc().getdName());
		}
		*/
		dao.bookAppointment();
}
}
