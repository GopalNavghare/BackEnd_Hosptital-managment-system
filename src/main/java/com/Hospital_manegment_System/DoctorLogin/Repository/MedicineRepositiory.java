package com.Hospital_manegment_System.DoctorLogin.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Hospital_manegment_System.DoctorLogin.Entity.Medicine;


@Repository
public interface MedicineRepositiory extends JpaRepository<Medicine ,Long>{

}