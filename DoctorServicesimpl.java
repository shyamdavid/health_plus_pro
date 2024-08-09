package com.health_plus_pro.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.health_plus_pro.entity.Doctor;
import com.health_plus_pro.repository.DoctorsRepository;
@Service
public class DoctorServicesimpl implements DoctorServices {
	@Autowired
	private DoctorsRepository doctorRepo;
	@Override
	public void saveDoctorData(Doctor doctor) {
		doctorRepo.save(doctor);
	}
	@Override
	public List <Doctor>getAllData(Doctor doctor)
	{
		List<Doctor> doctor1=doctorRepo.findAll(); 
		return doctor1;
	}
}
