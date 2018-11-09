package com.serzh.service;

import java.util.List;
import java.util.Optional;

import com.serzh.entity.Employee;

public interface EmployeeService {

    List<Employee> retrieveEmployees();

    Optional<Employee> getEmployee(Long employeeId);

    void saveEmployee(Employee employee);

    void deleteEmployee(Long employeeId);

    void updateEmployee(Employee employee);
}
