package com.health_plus_pro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.health_plus_pro.entity.Doctor;

public interface DoctorsRepository extends JpaRepository<Doctor, Long> {
	
	

}
