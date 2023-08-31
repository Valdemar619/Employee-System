package com.example.SpringBootwebapp.service;

import com.example.SpringBootwebapp.model.Employee;
import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployeeById(Long id);

    void deleteEmployeeById(Long id);
}
