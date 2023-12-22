package com.result.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.result.entity.Student;
import com.result.repository.StudentRepository;
import com.result.service.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService{
	
	@Autowired
	private StudentRepository studentRepository;
	
	
	
	@Override
	public Student addResult(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
		
	}

	@Override
	public Student getResult(Long rollno) {
		return studentRepository.findById(rollno).get();
	
	}

	@Override
	public void deleteResult(Long rollno) {
		// TODO Auto-generated method stub
		
		 studentRepository.deleteById(rollno);
	}

	@Override
	public Student updateResult(Student student) throws Exception {
		// TODO Auto-generated method stub
		Student isExisted = studentRepository.findById(student.getRollno()).get();
		if(isExisted.getRollno().equals(student.getRollno())) {
		  return studentRepository.save(student);
		}
		else {
			throw new Exception("not updated");
		}
	}
	
	public List<Student> getAllResult(){
		return studentRepository.findAll();
	}

	
	

}
