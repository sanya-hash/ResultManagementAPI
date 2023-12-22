package com.result.service;

import java.util.List;

import com.result.entity.Student;

public interface TeacherService {
	Student addResult(Student student);
	Student getResult(Long rollno);
	void deleteResult(Long rollno);
	Student updateResult(Student student) throws Exception;
	List<Student> getAllResult();
}
