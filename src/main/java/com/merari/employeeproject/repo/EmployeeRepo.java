package com.merari.employeeproject.repo;

import com.merari.employeeproject.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> { //pass in the class the repo is from and data type of the primary key

    void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);
}
