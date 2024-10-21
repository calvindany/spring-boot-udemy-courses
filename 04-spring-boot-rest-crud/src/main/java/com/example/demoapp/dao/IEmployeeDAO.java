package com.example.demoapp.dao;

import com.example.demoapp.entity.Employee;

import java.util.List;

public interface IEmployeeDAO {
    List<Employee> findAll();
}
