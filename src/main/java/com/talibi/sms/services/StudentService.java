package com.talibi.sms.services;

import java.util.List;

import com.talibi.sms.models.Student;

public interface StudentService {
	List<Student> getAllStudents();
	Student saveNewStudent(Student student);
	Student updateStudent(Student student);
	Student getStudentById(Long id);
}
