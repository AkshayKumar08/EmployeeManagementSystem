package net.akshay.empmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.akshay.empmanagementsystem.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // all CRUD methods
}
