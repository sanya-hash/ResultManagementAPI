package com.result.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.result.entity.Student;
import com.result.service.TeacherService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/result")
public class TeacherController {
	
	@Autowired
	private TeacherService teacherService;
	
	@PostMapping("")
	public ResponseEntity<Student> addResult(@RequestBody Student student) {
		student = teacherService.addResult(student);
		return ResponseEntity.ok(student);
		
	}
	
	@GetMapping("")
	public List<Student> getAllResults(){
		return this.teacherService.getAllResult();
	}
	@GetMapping("/{rollnumber}")
	public Student getResult(@PathVariable Long rollnumber) {
		return this.teacherService.getResult(rollnumber); 
	}
	
	@DeleteMapping("/{rollno}")
	public void deleteResult(@PathVariable Long rollno) {
		teacherService.deleteResult(rollno);
	}
	
	@PutMapping("")
	public Student updateResult(@RequestBody Student student) throws Exception {
	    return teacherService.updateResult(student);
	}
	
}
