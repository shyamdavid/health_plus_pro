package com.health_plus_pro.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.health_plus_pro.entity.Technician;
import com.health_plus_pro.repository.TechnicianRepository;
@Service
public class TechnicianServiceImpl implements TechnicianService {
@Autowired
private TechnicianRepository techRepo; 
	@Override
	public void saveTechnicianData(Technician technician) {
			
		techRepo.save(technician);
		
		
	}

}
