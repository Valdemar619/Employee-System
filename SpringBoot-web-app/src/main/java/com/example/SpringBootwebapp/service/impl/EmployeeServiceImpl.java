package com.example.SpringBootwebapp.service.impl;

import com.example.SpringBootwebapp.exception.DataProcessingException;
import com.example.SpringBootwebapp.model.Employee;
import com.example.SpringBootwebapp.repository.EmployeeRepository;
import com.example.SpringBootwebapp.service.EmployeeService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public void saveEmployee(Employee employee) {
        this.employeeRepository.save(employee);
    }

    @Override
        public Employee getEmployeeById(Long id) {
        Optional<Employee> optional =  employeeRepository.findById(id);
        Employee employee = null;
        if (optional.isPresent()) {
            employee = optional.get();
        } else {
            throw new DataProcessingException("Employee not found for id :: " + id);
        }
        return employee;
    }

    @Override
    public void deleteEmployeeById(Long id) {
        this.employeeRepository.deleteById(id);
    }
}
