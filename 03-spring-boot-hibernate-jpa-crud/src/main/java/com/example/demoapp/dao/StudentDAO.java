package com.example.demoapp.dao;

import com.example.demoapp.entity.Student;

public interface StudentDAO {
    Student findById(int id);
    void save(Student theStudent);
}
