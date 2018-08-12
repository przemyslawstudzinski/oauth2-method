package com.example.oauth2.method.repository;

import com.example.oauth2.method.domain.Employee;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, UUID> {

}
