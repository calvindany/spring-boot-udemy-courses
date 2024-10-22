package com.example.demoapp.rest.archive;

import com.example.demoapp.entity.archive.Student;
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

        if( (studentId >= students.size()) || studentId < 0 ) {
            throw new StudentNotFoundException("Student id is not found - " + studentId);
        }

        return students.get(studentId);
    }
}
