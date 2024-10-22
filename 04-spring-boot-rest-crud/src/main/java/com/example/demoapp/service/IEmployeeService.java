package com.example.demoapp.service;

import com.example.demoapp.entity.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> findAll();

    Employee findById(int id);

    Employee save(Employee employee);

    void deleteById(int id);
}
