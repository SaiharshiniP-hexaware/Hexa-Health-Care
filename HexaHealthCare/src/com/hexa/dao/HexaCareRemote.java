package com.hexa.dao;

import java.util.List;

import com.hexa.entity.Appointment;
import com.hexa.entity.DoctorSchedule;
import com.hexa.entity.Doctors;
import com.hexa.entity.Specialization;

public interface HexaCareRemote {
public List<Doctors> showDoctors();
public List<Specialization> showSpecializations();
public List<Doctors> doctorWithSpecialization(String specName);
public List<DoctorSchedule> appointmentSchedule(int docId);
public List<Appointment> showHistory();
public List<Appointment> showPatientHistory(long mobnum);
public int bookAppointment();
}
