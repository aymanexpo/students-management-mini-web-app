package com.talibi.sms.services.implement;

import java.util.List;

import org.springframework.stereotype.Service;

import com.talibi.sms.models.Student;
import com.talibi.sms.repositories.StudentRepository;
import com.talibi.sms.services.StudentService;

@Service
public class StudentServiceImplement implements StudentService{
	
	private StudentRepository studentRepository;
	
	public StudentServiceImplement(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student saveNewStudent(Student student) {
		return studentRepository.save(student);
	}

}
