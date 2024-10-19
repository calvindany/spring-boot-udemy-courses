package com.example.demoapp.dao;

import com.example.demoapp.entity.Student;

import java.util.List;

public interface StudentDAO {
    Student findById(int id);

    List<Student> findAll();

    void save(Student theStudent);
}
