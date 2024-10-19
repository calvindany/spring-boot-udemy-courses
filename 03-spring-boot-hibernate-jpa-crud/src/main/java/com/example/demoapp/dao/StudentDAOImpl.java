package com.example.demoapp.dao;

import com.example.demoapp.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO {

    private final EntityManager entityManager;

    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Student findById(int id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findAll() {

        // "FROM Student => Student diambil dari nama entity bukan nama table.
        // "ORDER BY lastName => lastName diambil dari JPA Entity field yang ada di Student
        TypedQuery<Student> query = entityManager.createQuery("FROM Student ORDER BY last_name DESC", Student.class);

        return query.getResultList();
    }

    @Override
    public List<Student> findByLastName(String last_name) {
        TypedQuery<Student> query = entityManager.createQuery("FROM Student WHERE last_name = :lastName", Student.class);

        query.setParameter("lastName", last_name);

        return query.getResultList();
    }

    @Override
    @Transactional
    public void save(Student theStudent) {
        entityManager.persist(theStudent);
    }

    @Override
    @Transactional
    public void update(Student updatedData) {
        entityManager.merge(updatedData);
    }
}
