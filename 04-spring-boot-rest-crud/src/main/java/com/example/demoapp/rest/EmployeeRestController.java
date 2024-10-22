package com.example.demoapp.rest;

import com.example.demoapp.entity.Employee;
import com.example.demoapp.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeeRestController {

    final private EmployeeService employeeService;

    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("")
    public List<Employee> getEmployees() {
        List<Employee> employees = employeeService.findAll();

        return employees;
    }

    @GetMapping("/{employeeId}")
    public Employee getEmployeeById(@PathVariable int employeeId) {
        Employee employee = employeeService.findById(employeeId);

        if(employee == null) {
            throw new RuntimeException("Employee id not found: " + employeeId);
        }

        return employee;
    }

    @PostMapping("")
    public Employee addEmployee(@RequestBody Employee employee) {
        employee.setId(0);
        System.out.println(employee.getEmail());
        System.out.println(employee);
        Employee insertedEmployee = employeeService.save(employee);

        return insertedEmployee;
    }

    @PutMapping("")
    public Employee updateEmployee(@RequestBody Employee employee) {
        return employeeService.save(employee);
    }

    @DeleteMapping("/{employeeId}")
    public String deleteEmployee(@PathVariable int employeeId) {
        employeeService.deleteById(employeeId);

        return "Deleted employee id: " + employeeId;
    }
}
