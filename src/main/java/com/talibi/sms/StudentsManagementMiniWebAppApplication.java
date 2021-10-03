package com.talibi.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.talibi.sms.models.Student;
import com.talibi.sms.repositories.StudentRepository;

@SpringBootApplication
public class StudentsManagementMiniWebAppApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentsManagementMiniWebAppApplication.class, args);
	}

	@Autowired private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		/*Student student1 = new Student("Aymane", "Talibi", "aymanetalibi@gmail.com");
		studentRepository.save(student1);
		
		Student student2 = new Student("Ahlam", "Zaouri", "ahlam@gmail.com");
		studentRepository.save(student2);
		
		Student student3 = new Student("Kamal", "Rachidi", "kamal@gmail.com");
		studentRepository.save(student3);*/
	}

}
