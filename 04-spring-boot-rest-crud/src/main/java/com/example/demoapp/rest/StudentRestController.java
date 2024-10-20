package com.example.demoapp.rest;

import com.example.demoapp.entity.Student;
import jakarta.annotation.PostConstruct;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException (StudentNotFoundException err) {
        StudentErrorResponse error = new StudentErrorResponse();

        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setMessage(err.getMessage());
        error.setTimestamp(System.currentTimeMillis());

        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException (Exception err) {
        StudentErrorResponse error = new StudentErrorResponse();

        error.setStatus(HttpStatus.BAD_REQUEST.value());
        error.setMessage(err.getMessage());
        error.setTimestamp(System.currentTimeMillis());

        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
}
