package com.example.demoapp.dao;

import com.example.demoapp.entity.Student;

import java.util.List;

public interface StudentDAO {
    Student findById(int id);

    List<Student> findAll();

    List<Student> findByLastName(String last_name);

    void save(Student theStudent);

    void update(Student updatedData);

    void delete(int id);
}
