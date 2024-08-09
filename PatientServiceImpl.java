package com.health_plus_pro.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.health_plus_pro.entity.Patient;
import com.health_plus_pro.repository.PatientRepository;
@Service
public class PatientServiceImpl implements PatientService {
@Autowired
private PatientRepository patRepo;
	@Override
	public void savePatientData(Patient patient) {
			patRepo.save(patient);

	}
	@Override
	public List<Patient> getAllData(Patient patient) {
		
		List<Patient> patients = patRepo.findAll();
		return patients;
	}
	@Override
	public void deleteOnePat(long id) {
		patRepo.deleteById(id);
	}
	
	

}
