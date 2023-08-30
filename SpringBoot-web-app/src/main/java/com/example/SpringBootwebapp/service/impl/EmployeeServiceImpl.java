package com.example.SpringBootwebapp.service.impl;

import com.example.SpringBootwebapp.model.Employee;
import com.example.SpringBootwebapp.repository.EmployeeRepository;
import com.example.SpringBootwebapp.service.EmployeeService;
import java.util.List;
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
}
