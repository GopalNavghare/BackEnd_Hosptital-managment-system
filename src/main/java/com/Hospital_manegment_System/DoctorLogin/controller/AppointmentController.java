package com.Hospital_manegment_System.DoctorLogin.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.management.AttributeNotFoundException;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Hospital_manegment_System.DoctorLogin.Entity.Appointment;
import com.Hospital_manegment_System.DoctorLogin.Repository.AppointmentRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v2")
public class AppointmentController 
{
	@Autowired
	private AppointmentRepository appointmentRepository;
	
	@PostMapping("/appointments")
	public Appointment createAppointment(@RequestBody Appointment appointment)
	{
		return appointmentRepository.save(appointment);
	
	}
	@GetMapping("/appointments")
	public List<Appointment> getAllAppointment()
	{
		return appointmentRepository.findAll();
		
	}
	@DeleteMapping("/appointments/{id}")
	public ResponseEntity<Map<String,Boolean>>deleteAppointment(@PathVariable long id) throws AttributeNotFoundException{
	
		Appointment appointment=appointmentRepository.findById(id).orElseThrow(()->  new AttributeNotFoundException("Appointment not found id "+id));
		appointmentRepository.delete(appointment);
		Map<String,Boolean> response=new HashMap<String,Boolean>();
		response.put("Delete", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}

}