package com.Hospital_manegment_System.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Hospital_manegment_System.Entity.AdminRegister;

public interface AdminRegisterRepository extends JpaRepository<AdminRegister, Long> {
    AdminRegister findByUsername(String username);
}
