package com.talibi.sms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.talibi.sms.models.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
