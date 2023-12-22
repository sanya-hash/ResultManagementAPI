package com.result.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.result.entity.Student;
import com.result.repository.StudentRepository;
import com.result.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Student saveData(Student student) {
		return studentRepository.save(student);
		
		
	}

}
