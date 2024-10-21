package com.example.demoapp.rest;

import com.example.demoapp.dao.EmployeeDAO;
import com.example.demoapp.entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeeRestController {

    private EmployeeDAO employeeDAO;

    public EmployeeRestController(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @GetMapping("")
    public List<Employee> getEmployees() {
        List<Employee> employees = employeeDAO.findAll();

        return employees;
    }
}
