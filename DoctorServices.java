package com.health_plus_pro.services;

import java.util.List;

import com.health_plus_pro.entity.Doctor;

public interface DoctorServices {

	public void saveDoctorData(Doctor doctor);
	
	public List<Doctor> getAllData (Doctor doctor1);
	
}
