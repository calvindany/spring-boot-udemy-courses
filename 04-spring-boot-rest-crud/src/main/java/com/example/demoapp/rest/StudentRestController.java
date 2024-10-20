package com.example.demoapp.rest;

import com.example.demoapp.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentRestController {

    private List<Student> students;

    // This method will run after the bean is created
    @PostConstruct
    public void loadData() {
        students = new ArrayList<>();

        students.add(new Student("Tasya", "Lee"));
        students.add(new Student("Mariana", "Jones"));
        students.add(new Student("Claudia", "Lara"));

    }

    @GetMapping("")
    public List<Student> getStudents() {
        return students;
    }

    @GetMapping("/{studentId}")
    public Student getStudentById(@PathVariable int studentId) {
        return students.get(studentId);
    }
}
