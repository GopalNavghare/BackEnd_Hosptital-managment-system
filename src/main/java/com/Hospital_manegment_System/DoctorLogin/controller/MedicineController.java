package com.Hospital_manegment_System.DoctorLogin.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.management.AttributeNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Hospital_manegment_System.DoctorLogin.Entity.Medicine;
import com.Hospital_manegment_System.DoctorLogin.Repository.MedicineRepositiory;
import com.Hospital_manegment_System.Entity.Patient;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v3")
public class MedicineController 
{

	@Autowired
	private MedicineRepositiory medicineRepository;
	
	@PostMapping("/medicines")
	public Medicine createMedicine(@RequestBody Medicine medicine) {
		
		return medicineRepository.save(medicine);
	}
	
	@GetMapping("/medicines")
	public List<Medicine> getAllMedicine()
	{
		
		return medicineRepository.findAll();
	}
	
	@DeleteMapping("/medicines/{id}")
	public ResponseEntity<Map<String,Boolean>>deleteMedicine(@PathVariable long id) throws AttributeNotFoundException
	{
		Medicine medicine=medicineRepository.findById(id).orElseThrow(()->  new AttributeNotFoundException("Medicine not found id "+id));
		medicineRepository.delete(medicine);
		Map<String,Boolean> response=new HashMap<String,Boolean>();
		response.put("Delete", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}

	@GetMapping("/medicines/{id}")
	public ResponseEntity<Medicine> getPatientById(@PathVariable long id) throws AttributeNotFoundException
	{
		
		Medicine medicine=medicineRepository.findById(id).orElseThrow(()->new AttributeNotFoundException("medicine not found id"+id));
		return ResponseEntity.ok(medicine);
	}
	
	@PutMapping("/medicines/{id}")
	public ResponseEntity<Medicine> updateMedicineEntity(@PathVariable long id,@RequestBody Medicine medicineDetails) throws AttributeNotFoundException{
		Medicine medicine=medicineRepository.findById(id).orElseThrow(()->new AttributeNotFoundException("Medicine not fount id"+id));
		
		medicine.setDrugname(medicineDetails.getDrugname());
		medicine.setStock(medicineDetails.getStock());
		Medicine savedMedicine=medicineRepository.save(medicine);
		return ResponseEntity.ok(savedMedicine);
	}
}
