package com.example.demoapp;

import com.example.demoapp.dao.StudentDAO;
import com.example.demoapp.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoappApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoappApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner -> {
//			createStudent(studentDAO);
			createMultipleStudent(studentDAO);
		};
	}

	public void createMultipleStudent(StudentDAO studentDAO) {
		System.out.println("Starting Insert 3 Student Data Process");

		Student tempStudent1 = new Student("John", "Doe", "johndoe@mail.com");
		Student tempStudent2 = new Student("Benita", "Applebum", "benita@mail.com");
		Student tempStudent3 = new Student("Mary", "Public", "maryy@mail.com");

		System.out.println("Saving student data 1");
		studentDAO.save(tempStudent1);
		System.out.println("Student data is saved, ID: " + tempStudent1.getId());

		System.out.println("Saving student data 2");
		studentDAO.save(tempStudent2);
		System.out.println("Student data is saved, ID: " + tempStudent2.getId());

		System.out.println("Saving student data 3");
		studentDAO.save(tempStudent3);
		System.out.println("Student data is saved, ID: " + tempStudent3.getId());

	}

	private void createStudent(StudentDAO studentDAO) {
		System.out.println("Starting Insert Student Data Process");

		Student tempStudent = new Student("Calvin", "Dany", "calvindany@mail.com");

		System.out.println("Saving student data");
		studentDAO.save(tempStudent);

		System.out.println("Student data is saved, ID: " + tempStudent.getId());
	}
}
