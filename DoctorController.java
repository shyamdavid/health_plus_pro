package com.health_plus_pro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.health_plus_pro.entity.Doctor;
import com.health_plus_pro.entity.Patient;
import com.health_plus_pro.entity.Technician;
import com.health_plus_pro.services.DoctorServices;
import com.health_plus_pro.services.PatientService;
import com.health_plus_pro.services.TechnicianService;

@Controller
public class DoctorController {
	@Autowired
	private DoctorServices doctorservices;
	
	@Autowired
	private PatientService patientservice;
	
	@Autowired
	private TechnicianService technicianservice;
	
	
	
	
	//http://Localhost:8080/new_reg
	@RequestMapping("/new_reg")
	public String show()
	{
		return "doctor_reg";
	}
	@RequestMapping("/savedoctor")
	public String savedoctor(Doctor doctor)
	{
		doctorservices.saveDoctorData(doctor);
		return "doctor_reg";
	}
	
	
	
	//save patient
	@RequestMapping("/newpat")
	public String newpat() {
		return "patient_reg";
	}
	@RequestMapping("/savepatient")
	public String savepatient(Patient patient)
	{
		
		patientservice.savePatientData(patient);
		return "patient_reg";
	}
	
	
	
	//save technician
	@RequestMapping("/newtech")
	public String newtech()
	{
		return "Technician_reg";
	}
	@RequestMapping("/savetechnician")
	public String savetechnician(Technician technician)
	{
		technicianservice.saveTechnicianData(technician);
		return "Technician_reg";
	}
	
	
	//List all patients
	@RequestMapping("/ListAllPat")
	public String ListAllPat(Patient patient,Model model)
	{
		List<Patient> patients = patientservice.getAllData(patient);
		model.addAttribute("patients",patients);
		return "List_all_pat";
	}
	
	
	
	//List all Doctors
	@RequestMapping("/ListAllDoc")
	public String ListAllDoc(Doctor doctor1,Model model)
	{
		List<Doctor> doctor=doctorservices.getAllData(doctor1);
		model.addAttribute("doctor",doctor);
		return "List_All_Doctors";
	}
	
	
	
	//delete_patients
	@RequestMapping("/deletepat")
	public String deletepat(@RequestParam("id") long id,Patient patient,Model model){
		patientservice.deleteOnePat(id);
		List<Patient> patients=patientservice.getAllData(patient);
		model.addAttribute("patients",patients);
		return "List_all_pat";
	}
	
	
}
