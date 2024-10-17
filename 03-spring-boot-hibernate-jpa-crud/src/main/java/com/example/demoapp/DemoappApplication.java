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
			createStudent(studentDAO);
		};
	}

	private void createStudent(StudentDAO studentDAO) {
		System.out.println("Starting Insert Student Data Process");

		Student tempStudent = new Student("Calvin", "Dany", "calvindany@mail.com");

		System.out.println("Saving student data");
		studentDAO.save(tempStudent);

		System.out.println();
	}
}
