package com.example.demoapp.dao;

import com.example.demoapp.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAO implements IEmployeeDAO{
    private EntityManager entityManager;

    @Autowired
    public EmployeeDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {
        TypedQuery<Employee> query = entityManager.createQuery("FROM Employee", Employee.class);

        List<Employee> employees = query.getResultList();

        return employees;
    }

    @Override
    public Employee findById(int id) {
        Employee employee = entityManager.find(Employee.class, id);

        return employee;
    }

    @Override
    public Employee save(Employee employee) {
        Employee emp = entityManager.merge(employee);

        // Return id of inserted data
        return emp;
    }

    @Override
    public void deleteById(int id) {

        Employee emp = entityManager.find(Employee.class, id);

        entityManager.remove(emp);
    }
}
