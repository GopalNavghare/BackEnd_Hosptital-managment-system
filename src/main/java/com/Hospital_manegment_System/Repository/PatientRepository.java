package com.Hospital_manegment_System.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.Hospital_manegment_System.Entity.Patient;
@Repository
public interface PatientRepository  extends JpaRepository <Patient , Long>{
 

}
