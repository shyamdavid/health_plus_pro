package com.health_plus_pro.services;

import java.util.List;

import com.health_plus_pro.entity.Patient;

public interface PatientService {

	
	public void savePatientData(Patient patient);
	
	
	public List <Patient> getAllData(Patient patient);


	public void deleteOnePat(long id);


	
	
	
	
	
}
